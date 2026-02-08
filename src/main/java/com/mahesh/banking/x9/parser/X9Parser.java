package com.mahesh.banking.x9.parser;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.mahesh.banking.x9.model.X9Record;
import com.mahesh.banking.x9.processor.X9RecordProcessor;
import com.mahesh.banking.x9.record.X9AccountsTotal40Record;
import com.mahesh.banking.x9.record.X9BoxSummary75Record;
import com.mahesh.banking.x9.record.X9BundleControl70Record;
import com.mahesh.banking.x9.record.X9BundleHeader20Record;
import com.mahesh.banking.x9.record.X9CashLetterControl90Record;
import com.mahesh.banking.x9.record.X9CashLetterHeader10Record;
import com.mahesh.banking.x9.record.X9CheckDetail25Record;
import com.mahesh.banking.x9.record.X9CheckDetailAddendumA26Record;
import com.mahesh.banking.x9.record.X9CheckDetailAddendumB27Record;
import com.mahesh.banking.x9.record.X9CheckDetailAddendumC28Record;
import com.mahesh.banking.x9.record.X9CreditReconciliation61Record;
import com.mahesh.banking.x9.record.X9DigitalCertificate64Record;
import com.mahesh.banking.x9.record.X9FileControl99Record;
import com.mahesh.banking.x9.record.X9FileHeader01Record;
import com.mahesh.banking.x9.record.X9ImageTestDetail56Record;
import com.mahesh.banking.x9.record.X9ImageTestSummary55Record;
import com.mahesh.banking.x9.record.X9ImageViewAnalysis54Record;
import com.mahesh.banking.x9.record.X9ImageViewData52Record;
import com.mahesh.banking.x9.record.X9ImageViewDetail50Record;
import com.mahesh.banking.x9.record.X9NonHitTotal41Record;
import com.mahesh.banking.x9.record.X9ReturnDetail31Record;
import com.mahesh.banking.x9.record.X9ReturnDetailAddendumA32Record;
import com.mahesh.banking.x9.record.X9ReturnDetailAddendumB33Record;
import com.mahesh.banking.x9.record.X9ReturnDetailAddendumC34Record;
import com.mahesh.banking.x9.record.X9ReturnDetailAddendumD35Record;
import com.mahesh.banking.x9.record.X9RoutingNumberSummary85Record;
import com.mahesh.banking.x9.record.X9User68Record;

public class X9Parser {

  private static final int MAX_RECORD_LENGTH_IN_FILE = 1_000_000;

  private final List<X9RecordProcessor> processors = new ArrayList<>();

  public X9Parser addProcessor(X9RecordProcessor processor) {
    processors.add(processor);
    return this;
  }

  public void parse(InputStream inputStream) throws IOException, InstantiationException, IllegalAccessException,
      IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {

    byte[] first4Bytes = new byte[4];

    int len = 0;

    while ((len = inputStream.readNBytes(first4Bytes, 0, first4Bytes.length)) != 0) {

      ByteBuffer recordSizeBuffer = ByteBuffer.wrap(first4Bytes);
      int recSize = recordSizeBuffer.getInt();

      if (recSize > MAX_RECORD_LENGTH_IN_FILE) {
        throw new IOException("Record size " + recSize + " exceeds max limit of " + MAX_RECORD_LENGTH_IN_FILE);
      }

      byte[] data = inputStream.readNBytes(recSize);

      X9Record record = X9RecordParser.parseRecord(data);

      processRecord(record);

    }

  }

  private void processRecord(X9Record record) {

    processors.forEach(processor -> processor.process(record));
    switch (record.getRecordType()) {
      case FILE_HEADER_01_RCD:
        processors.forEach(processor -> processor.process01Record((X9FileHeader01Record) record));
        break;
      case CASH_LETTER_HEADER_10_RCD:
        processors.forEach(processor -> processor.process10Record((X9CashLetterHeader10Record) record));
        break;
      case BUNDLE_HEADER_20_RCD:
        processors.forEach(processor -> processor.process20Record((X9BundleHeader20Record) record));
        break;
      case CHECK_DETAIL_25_RCD:
        processors.forEach(processor -> processor.process25Record((X9CheckDetail25Record) record));
        break;
      case CHECK_DETAIL_ADDENDUM_A_26_RCD:
        processors.forEach(processor -> processor.process26Record((X9CheckDetailAddendumA26Record) record));
        break;
      case CHECK_DETAIL_ADDENDUM_B_27_RCD:
        processors.forEach(processor -> processor.process27Record((X9CheckDetailAddendumB27Record) record));
        break;
      case CHECK_DETAIL_ADDENDUM_C_28_RCD:
        processors.forEach(processor -> processor.process28Record((X9CheckDetailAddendumC28Record) record));
        break;
      case RETURN_DETAIL_31_RCD:
        processors.forEach(processor -> processor.process31Record((X9ReturnDetail31Record) record));
        break;
      case RETURN_DETAIL_ADDENDUM_A_32_RCD:
        processors.forEach(processor -> processor.process32Record((X9ReturnDetailAddendumA32Record) record));
        break;
      case RETURN_DETAIL_ADDENDUM_B_33_RCD:
        processors.forEach(processor -> processor.process33Record((X9ReturnDetailAddendumB33Record) record));
        break;
      case RETURN_DETAIL_ADDENDUM_C_34_RCD:
        processors.forEach(processor -> processor.process34Record((X9ReturnDetailAddendumC34Record) record));
        break;
      case RETURN_DETAIL_ADDENDUM_D_35_RCD:
        processors.forEach(processor -> processor.process35Record((X9ReturnDetailAddendumD35Record) record));
        break;
      case ACCOUNTS_TOTAL_40_RCD:
        processors.forEach(processor -> processor.process40Record((X9AccountsTotal40Record) record));
        break;
      case NON_HIT_TOTAL_41_RCD:
        processors.forEach(processor -> processor.process41Record((X9NonHitTotal41Record) record));
        break;
      case IMAGE_VIEW_DETAIL_50_RCD:
        processors.forEach(processor -> processor.process50Record((X9ImageViewDetail50Record) record));
        break;
      case IMAGE_VIEW_DATA_52_RCD:
        processors.forEach(processor -> processor.process52Record((X9ImageViewData52Record) record));
        break;
      case IMAGE_VIEW_ANALYSIS_54_RCD:
        processors.forEach(processor -> processor.process54Record((X9ImageViewAnalysis54Record) record));
        break;
      case IMAGE_TEST_SUMMARY_55_RCD:
        processors.forEach(processor -> processor.process55Record((X9ImageTestSummary55Record) record));
        break;
      case IMAGE_TEST_DETAIL_56_RCD:
        processors.forEach(processor -> processor.process56Record((X9ImageTestDetail56Record) record));
        break;
      case CREADIT_RECONCILIATION_61_RCD:
        processors.forEach(processor -> processor.process61Record((X9CreditReconciliation61Record) record));
        break;
      case DIGITAL_CERTIFICATE_64_RCD:
        processors.forEach(processor -> processor.process64Record((X9DigitalCertificate64Record) record));
        break;
      case USER_RECORD_68_RCD:
        processors.forEach(processor -> processor.process68Record((X9User68Record) record));
        break;
      case BUNDLE_CONTROL_70_RCD:
        processors.forEach(processor -> processor.process70Record((X9BundleControl70Record) record));
        break;
      case BOX_SUMMARY_75_RCD:
        processors.forEach(processor -> processor.process75Record((X9BoxSummary75Record) record));
        break;
      case ROUTING_NUMBER_SUMMARY_85_RCD:
        processors.forEach(processor -> processor.process85Record((X9RoutingNumberSummary85Record) record));
        break;
      case CASH_LETTER_CONTROL_90_RCD:
        processors.forEach(processor -> processor.process90Record((X9CashLetterControl90Record) record));
        break;
      case FILE_CONTROL_99_RCD:
        processors.forEach(processor -> processor.process99Record((X9FileControl99Record) record));
        break;
      default:
        break;
    }
  }

}
