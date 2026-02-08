package com.mahesh.banking.x9.record;

import com.mahesh.banking.x9.model.X9RecordType;

public class X9ReturnDetailAddendumC34Record extends DefaultX9Record {

  public X9ReturnDetailAddendumC34Record() {
  }

  @Override
  public byte[] toByteArray() {
    return new byte[0];
  }

  @Override
  public X9RecordType getRecordType() {
    return X9RecordType.RETURN_DETAIL_ADDENDUM_C_34_RCD;
  }
}
