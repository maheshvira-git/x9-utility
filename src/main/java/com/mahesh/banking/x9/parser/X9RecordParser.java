package com.mahesh.banking.x9.parser;

import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

import com.mahesh.banking.x9.model.X9Record;
import com.mahesh.banking.x9.model.X9RecordType;
import com.mahesh.banking.x9.record.DefaultX9Record;

public class X9RecordParser {

  public static X9Record parseRecord(byte[] data) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
    
    //Get First 2 Bytes to identify record type
    byte[] recordTypeBytes = new byte[2];
    System.arraycopy(data, 0, recordTypeBytes, 0, recordTypeBytes.length);
    String recordType = new String(recordTypeBytes, Charset.forName("ibm037"));
        
    System.out.println(recordType+ " => "+new String(data, Charset.forName("ibm037")) );

    X9RecordType recordTypeObj = X9RecordType.fromCode(recordType);

    DefaultX9Record defaultRecord = (DefaultX9Record) recordTypeObj.getRecordTypeClass().getConstructor().newInstance();

    return defaultRecord;
  }
}
