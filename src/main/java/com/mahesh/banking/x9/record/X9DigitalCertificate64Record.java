package com.mahesh.banking.x9.record;

import com.mahesh.banking.x9.model.X9RecordType;

public class X9DigitalCertificate64Record extends DefaultX9Record {

  public X9DigitalCertificate64Record() {
    
  }

  @Override
  public byte[] toByteArray() {    
    return new byte[0];
  }

  @Override
  public X9RecordType getRecordType() {
    return X9RecordType.DIGITAL_CERTIFICATE_64_RCD;
  }

}
