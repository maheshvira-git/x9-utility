package com.mahesh.banking.x9.record;

import com.mahesh.banking.x9.model.X9RecordType;

public class X9BundleControl70Record extends DefaultX9Record {

  public X9BundleControl70Record() {
  }

  @Override
  public byte[] toByteArray() {
    return new byte[0];
  }

    @Override
  public X9RecordType getRecordType() {
    return X9RecordType.BUNDLE_CONTROL_70_RCD;    
  }
}
