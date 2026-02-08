package com.mahesh.banking.x9.record;

import com.mahesh.banking.x9.model.X9RecordType;

public class X9ImageTestSummary55Record extends DefaultX9Record {

    public X9ImageTestSummary55Record() {
        
    }

    @Override
    public byte[] toByteArray() {
      return new byte[0];
    }

    @Override
    public X9RecordType getRecordType() {
      return X9RecordType.IMAGE_TEST_SUMMARY_55_RCD;
    }

}
