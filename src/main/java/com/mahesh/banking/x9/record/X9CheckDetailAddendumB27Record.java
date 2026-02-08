package com.mahesh.banking.x9.record;

import com.mahesh.banking.x9.model.X9RecordType;

public class X9CheckDetailAddendumB27Record extends DefaultX9Record {

  public X9CheckDetailAddendumB27Record() {
  }

  @Override
  public byte[] toByteArray() {
    return new byte[0];
  }

  @Override
  public X9RecordType getRecordType() {
    return X9RecordType.CHECK_DETAIL_ADDENDUM_B_27_RCD;
  }
}
