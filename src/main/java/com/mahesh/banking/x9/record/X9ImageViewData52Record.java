package com.mahesh.banking.x9.record;

import com.mahesh.banking.x9.model.X9RecordType;

public class X9ImageViewData52Record extends DefaultX9Record {

  public X9ImageViewData52Record() {
  }

  @Override
  public byte[] toByteArray() {
    return new byte[0];
  }

  @Override
  public X9RecordType getRecordType() {
    return X9RecordType.IMAGE_VIEW_DATA_52_RCD;
  }
}
