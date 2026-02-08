package com.mahesh.banking.x9.record;

import com.mahesh.banking.x9.model.X9RecordType;

public class X9BundleHeader20Record extends DefaultX9Record {

  public X9BundleHeader20Record() {
  }

  @Override
  public byte[] toByteArray() {
    return new byte[0];
  }

  @Override
  public X9RecordType getRecordType() {
    return X9RecordType.BUNDLE_HEADER_20_RCD;
  }
}
