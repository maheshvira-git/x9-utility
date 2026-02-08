package com.mahesh.banking.x9.record;

import com.mahesh.banking.x9.model.X9RecordType;

public class X9NonHitTotal41Record extends DefaultX9Record {

  public X9NonHitTotal41Record() {
  }

  @Override
  public byte[] toByteArray() {
    return new byte[0];
  }

  @Override
  public X9RecordType getRecordType() {
    return X9RecordType.NON_HIT_TOTAL_41_RCD;
  }
}
