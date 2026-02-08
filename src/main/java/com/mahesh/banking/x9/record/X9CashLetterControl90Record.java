package com.mahesh.banking.x9.record;

import com.mahesh.banking.x9.model.X9RecordType;

public class X9CashLetterControl90Record extends DefaultX9Record {

  public X9CashLetterControl90Record() {
  }

  @Override
  public byte[] toByteArray() {
    return new byte[0];
  }

  @Override
  public X9RecordType getRecordType() {
    return X9RecordType.CASH_LETTER_CONTROL_90_RCD;
  }
}
