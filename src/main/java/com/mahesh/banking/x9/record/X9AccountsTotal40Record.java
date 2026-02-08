package com.mahesh.banking.x9.record;

import com.mahesh.banking.x9.model.X9RecordType;

public class X9AccountsTotal40Record extends DefaultX9Record {

  public X9AccountsTotal40Record() {
  }

  @Override
  public byte[] toByteArray() {
    return new byte[0];
  }

  @Override
  public X9RecordType getRecordType() {
    return X9RecordType.ACCOUNTS_TOTAL_40_RCD;
  }
}
