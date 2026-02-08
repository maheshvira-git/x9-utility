package com.mahesh.banking.x9.model;

import com.mahesh.banking.x9.record.DefaultX9Record;
import com.mahesh.banking.x9.record.X9BundleHeader20Record;
import com.mahesh.banking.x9.record.X9CashLetterHeader10Record;
import com.mahesh.banking.x9.record.X9FileHeader01Record;
import com.mahesh.banking.x9.record.X9CheckDetail25Record;
import com.mahesh.banking.x9.record.X9CheckDetailAddendumA26Record;
import com.mahesh.banking.x9.record.X9CheckDetailAddendumB27Record;
import com.mahesh.banking.x9.record.X9CheckDetailAddendumC28Record;
import com.mahesh.banking.x9.record.X9ReturnDetail31Record;
import com.mahesh.banking.x9.record.X9ReturnDetailAddendumA32Record;
import com.mahesh.banking.x9.record.X9ReturnDetailAddendumB33Record;
import com.mahesh.banking.x9.record.X9ReturnDetailAddendumC34Record;
import com.mahesh.banking.x9.record.X9ReturnDetailAddendumD35Record;
import com.mahesh.banking.x9.record.X9RoutingNumberSummary85Record;
import com.mahesh.banking.x9.record.X9User68Record;
import com.mahesh.banking.x9.record.X9AccountsTotal40Record;
import com.mahesh.banking.x9.record.X9BoxSummary75Record;
import com.mahesh.banking.x9.record.X9NonHitTotal41Record;
import com.mahesh.banking.x9.record.X9ImageViewDetail50Record;
import com.mahesh.banking.x9.record.X9ImageViewData52Record;
import com.mahesh.banking.x9.record.X9ImageViewAnalysis54Record;
import com.mahesh.banking.x9.record.X9ImageTestDetail56Record;
import com.mahesh.banking.x9.record.X9ImageTestSummary55Record;
import com.mahesh.banking.x9.record.X9CreditReconciliation61Record;
import com.mahesh.banking.x9.record.X9DigitalCertificate64Record;
import com.mahesh.banking.x9.record.X9BundleControl70Record;
import com.mahesh.banking.x9.record.X9CashLetterControl90Record;
import com.mahesh.banking.x9.record.X9FileControl99Record;

import static com.mahesh.banking.x9.X9Constants.DEFAULT_RCD_LENGTH;
import static com.mahesh.banking.x9.X9Constants.DEFAULT_RCD_LENGTH_SUMMARY;
import static com.mahesh.banking.x9.X9Constants.UNDEFINED_RCD_LENGTH;

public enum X9RecordType {
    
  FILE_HEADER_01_RCD("01",DEFAULT_RCD_LENGTH, X9FileHeader01Record.class),
  CASH_LETTER_HEADER_10_RCD("10",DEFAULT_RCD_LENGTH, X9CashLetterHeader10Record.class),  
  BUNDLE_HEADER_20_RCD("20",DEFAULT_RCD_LENGTH, X9BundleHeader20Record.class),
  CHECK_DETAIL_25_RCD("25",DEFAULT_RCD_LENGTH, X9CheckDetail25Record.class),
  CHECK_DETAIL_ADDENDUM_A_26_RCD("26",DEFAULT_RCD_LENGTH, X9CheckDetailAddendumA26Record.class),
  CHECK_DETAIL_ADDENDUM_B_27_RCD("27",UNDEFINED_RCD_LENGTH, X9CheckDetailAddendumB27Record.class),
  CHECK_DETAIL_ADDENDUM_C_28_RCD("28",DEFAULT_RCD_LENGTH, X9CheckDetailAddendumC28Record.class),
  RETURN_DETAIL_31_RCD("31",DEFAULT_RCD_LENGTH, X9ReturnDetail31Record.class),
  RETURN_DETAIL_ADDENDUM_A_32_RCD("32",DEFAULT_RCD_LENGTH, X9ReturnDetailAddendumA32Record.class),
  RETURN_DETAIL_ADDENDUM_B_33_RCD("33",DEFAULT_RCD_LENGTH, X9ReturnDetailAddendumB33Record.class),
  RETURN_DETAIL_ADDENDUM_C_34_RCD("34",UNDEFINED_RCD_LENGTH, X9ReturnDetailAddendumC34Record.class),
  RETURN_DETAIL_ADDENDUM_D_35_RCD("35",DEFAULT_RCD_LENGTH, X9ReturnDetailAddendumD35Record.class),  
  ACCOUNTS_TOTAL_40_RCD("40",DEFAULT_RCD_LENGTH, X9AccountsTotal40Record.class),
  NON_HIT_TOTAL_41_RCD("41",DEFAULT_RCD_LENGTH, X9NonHitTotal41Record.class),
  IMAGE_VIEW_DETAIL_50_RCD("50",DEFAULT_RCD_LENGTH, X9ImageViewDetail50Record.class),
  IMAGE_VIEW_DATA_52_RCD("52",UNDEFINED_RCD_LENGTH, X9ImageViewData52Record.class),
  IMAGE_VIEW_ANALYSIS_54_RCD("54",DEFAULT_RCD_LENGTH, X9ImageViewAnalysis54Record.class),
  IMAGE_TEST_SUMMARY_55_RCD("55",DEFAULT_RCD_LENGTH_SUMMARY, X9ImageTestSummary55Record.class),
  IMAGE_TEST_DETAIL_56_RCD("56",UNDEFINED_RCD_LENGTH, X9ImageTestDetail56Record.class),
  CREADIT_RECONCILIATION_61_RCD("61",UNDEFINED_RCD_LENGTH, X9CreditReconciliation61Record.class),
  DIGITAL_CERTIFICATE_64_RCD("64",UNDEFINED_RCD_LENGTH, X9DigitalCertificate64Record.class),
  USER_RECORD_68_RCD("68",UNDEFINED_RCD_LENGTH, X9User68Record.class),
  BUNDLE_CONTROL_70_RCD("70",DEFAULT_RCD_LENGTH, X9BundleControl70Record.class),
  BOX_SUMMARY_75_RCD("75",DEFAULT_RCD_LENGTH, X9BoxSummary75Record.class),
  ROUTING_NUMBER_SUMMARY_85_RCD("85",DEFAULT_RCD_LENGTH, X9RoutingNumberSummary85Record.class),
  CASH_LETTER_CONTROL_90_RCD("90",DEFAULT_RCD_LENGTH, X9CashLetterControl90Record.class),
  FILE_CONTROL_99_RCD("99",DEFAULT_RCD_LENGTH, X9FileControl99Record.class);
  
  private final String recordTypeCode;
  private final int recordLength;
  private final Class<? extends DefaultX9Record> recordTypeClass;

  private X9RecordType(String recordTypeCode, int recordLength, Class<? extends DefaultX9Record> recordTypeClass) {
    this.recordTypeCode = recordTypeCode;
    this.recordLength = recordLength;
    this.recordTypeClass = recordTypeClass;
  }


  public String getRecordTypeCode() {
    return recordTypeCode;
  }

  public int getRecordLength() {
    return recordLength;
  }

  public Class<? extends DefaultX9Record> getRecordTypeClass() {
    return recordTypeClass;
  }

  public static X9RecordType fromCode(String code) {
    for (X9RecordType type : X9RecordType.values()) {
      if (type.getRecordTypeCode().equals(code)) {
        return type;
      }
    }
    return null;
  }
}