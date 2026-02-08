package com.mahesh.banking.x9.record;

import com.mahesh.banking.x9.model.X9RecordType;

public class X9ImageTestDetail56Record extends DefaultX9Record {

  public X9ImageTestDetail56Record() {
  }

  @Override
  public byte[] toByteArray() {
    return new byte[0];
  }

  @Override
  public X9RecordType getRecordType() {
    return X9RecordType.IMAGE_TEST_DETAIL_56_RCD;
  }
}
