package com.mahesh.banking.x9.record;

import com.mahesh.banking.x9.model.X9RecordType;

public class X9RoutingNumberSummary85Record extends DefaultX9Record {

    public X9RoutingNumberSummary85Record() {
    }

    @Override
    public byte[] toByteArray() {
      return new byte[0];
    }

    @Override
    public X9RecordType getRecordType() {
      return X9RecordType.ROUTING_NUMBER_SUMMARY_85_RCD;
    }

}
