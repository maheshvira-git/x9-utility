package com.mahesh.banking.x9.record;

import com.mahesh.banking.x9.model.X9RecordType;

public class X9ReturnDetailAddendumD35Record extends DefaultX9Record {

  public X9ReturnDetailAddendumD35Record() {
  }

  @Override
  public byte[] toByteArray() {
    return new byte[0];
  }

  @Override
  public X9RecordType getRecordType() {
    return X9RecordType.RETURN_DETAIL_ADDENDUM_D_35_RCD;
  }
}
