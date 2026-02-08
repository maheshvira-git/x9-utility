package com.mahesh.banking.x9.record;

import com.mahesh.banking.x9.model.X9RecordType;

public class X9BoxSummary75Record extends DefaultX9Record {

    public X9BoxSummary75Record() {
    }

    @Override
    public byte[] toByteArray() {
      return new byte[0];
    }

    @Override
    public X9RecordType getRecordType() {
      return X9RecordType.BOX_SUMMARY_75_RCD;
    } 
}