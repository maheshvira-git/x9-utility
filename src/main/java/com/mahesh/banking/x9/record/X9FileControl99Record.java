package com.mahesh.banking.x9.record;

import com.mahesh.banking.x9.model.X9RecordType;

public class X9FileControl99Record extends DefaultX9Record {

  public X9FileControl99Record() {
  }

  @Override
  public byte[] toByteArray() {
    return new byte[0];
  }

  @Override
  public X9RecordType getRecordType() {
    return X9RecordType.FILE_CONTROL_99_RCD;    
  }
}
