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
import com.mahesh.banking.x9.record.X9AccountsTotal40Record;
import com.mahesh.banking.x9.record.X9NonHitTotal42Record;
import com.mahesh.banking.x9.record.X9ImageViewDetail50Record;
import com.mahesh.banking.x9.record.X9ImageViewData52Record;
import com.mahesh.banking.x9.record.X9ImageViewAnalysis54Record;
import com.mahesh.banking.x9.record.X9ImageTestDetail56Record;
import com.mahesh.banking.x9.record.X9CreditReconciliation61Record;
import com.mahesh.banking.x9.record.X9BundleControl70Record;
import com.mahesh.banking.x9.record.X9CashLetterControl90Record;
import com.mahesh.banking.x9.record.X9FileControl99Record;

public enum X9RecordType {
    
  FILE_HEADER_01_RCD("01",80, X9FileHeader01Record.class),
  CASH_LETTER_HEADER_10_RCD("10",80, X9CashLetterHeader10Record.class),  
  BUNDLE_HEADER_20_RCD("20",80, X9BundleHeader20Record.class),
  CHECK_DETAIL_25_RCD("25",80, X9CheckDetail25Record.class),
  CHECK_DETAIL_ADDENDUM_A_26_RCD("26",80, X9CheckDetailAddendumA26Record.class),
  CHECK_DETAIL_ADDENDUM_B_27_RCD("27",80, X9CheckDetailAddendumB27Record.class),
  CHECK_DETAIL_ADDENDUM_C_28_RCD("28",80, X9CheckDetailAddendumC28Record.class),
  RETURN_DETAIL_31_RCD("31",80, X9ReturnDetail31Record.class),
  RETURN_DETAIL_ADDENDUM_A_32_RCD("32",80, X9ReturnDetailAddendumA32Record.class),
  RETURN_DETAIL_ADDENDUM_B_33_RCD("33",80, X9ReturnDetailAddendumB33Record.class),
  RETURN_DETAIL_ADDENDUM_C_34_RCD("34",80, X9ReturnDetailAddendumC34Record.class),
  RETURN_DETAIL_ADDENDUM_D_35_RCD("35",80, X9ReturnDetailAddendumD35Record.class),  
  ACCOUNTS_TOTAL_40_RCD("40",80, X9AccountsTotal40Record.class),
  NON_HIT_TOTAL_41_RCD("41",80, X9NonHitTotal42Record.class),
  IMAGE_VIEW_DETAIL_50_RCD("50",80, X9ImageViewDetail50Record.class),
  IMAGE_VIEW_DATA_52_RCD("52",-1, X9ImageViewData52Record.class),
  IMAGE_VIEW_ANALYSIS_54_RCD("54",80, X9ImageViewAnalysis54Record.class),
  IMAGE_TEST_DETAIL_56_RCD("56",80, X9ImageTestDetail56Record.class),
  CREADIT_RECONCILIATION_61_RCD("61",80, X9CreditReconciliation61Record.class),
  BUNDLE_CONTROL_70_RCD("70",80, X9BundleControl70Record.class),
  CASH_LETTER_CONTROL_90_RCD("90",80, X9CashLetterControl90Record.class),
  FILE_CONTROL_99_RCD("99",80, X9FileControl99Record.class);

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