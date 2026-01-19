package com.mahesh.banking.x9.processor;

import com.mahesh.banking.x9.record.X9FileHeader01Record;

public interface X9RecordProcessor {

  void process01Record(X9FileHeader01Record record);

  //TODO: Add methods to process other record types
  
  
} 
