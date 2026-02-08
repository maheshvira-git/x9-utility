package com.mahesh.banking.x9.record;

import com.mahesh.banking.x9.model.X9RecordType;

public class X9ImageViewDetail50Record extends DefaultX9Record {

  public X9ImageViewDetail50Record() {
  }

  @Override
  public byte[] toByteArray() {
    return new byte[0];
  }

  @Override
  public X9RecordType getRecordType() {
    return X9RecordType.IMAGE_VIEW_DETAIL_50_RCD;
  }
}
