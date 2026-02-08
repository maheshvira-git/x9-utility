package com.mahesh.banking.x9.record;

import com.mahesh.banking.x9.model.X9RecordType;

public class X9ReturnDetailAddendumB33Record extends DefaultX9Record {

  public X9ReturnDetailAddendumB33Record() {
  }

  @Override
  public byte[] toByteArray() {
    return new byte[0];
  }

  @Override
  public X9RecordType getRecordType() {
    return X9RecordType.RETURN_DETAIL_ADDENDUM_B_33_RCD;
  }
}
