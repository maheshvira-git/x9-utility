package com.mahesh.banking.x9.record;

import com.mahesh.banking.x9.model.X9RecordType;

public class X9CashLetterHeader10Record extends DefaultX9Record {

  public X9CashLetterHeader10Record() {
  }

  @Override
  public byte[] toByteArray() {
    return new byte[0];
  }

  @Override
  public X9RecordType getRecordType() {
    return X9RecordType.CASH_LETTER_HEADER_10_RCD;
  }
}
