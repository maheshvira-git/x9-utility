package com.mahesh.banking.x9.model;

public interface X9Record {
  byte[] toByteArray();  
  X9RecordType getRecordType();
} 
