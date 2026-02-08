package com.mahesh.banking.x9.record;

import com.mahesh.banking.x9.model.X9RecordType;

public class X9CheckDetailAddendumA26Record extends DefaultX9Record {

  public X9CheckDetailAddendumA26Record() {
  }

  @Override
  public byte[] toByteArray() {
    return new byte[0];
  }

  @Override
  public X9RecordType getRecordType() {
    return X9RecordType.CHECK_DETAIL_ADDENDUM_A_26_RCD;
  }
}
