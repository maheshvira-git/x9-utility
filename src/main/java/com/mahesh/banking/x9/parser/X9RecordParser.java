package com.mahesh.banking.x9.parser;

import java.nio.charset.Charset;

public class X9RecordParser {

  public static void parseRecord(byte[] data) {
    
    //Get First 2 Bytes to identify record type
    byte[] recordTypeBytes = new byte[2];
    System.arraycopy(data, 0, recordTypeBytes, 0, recordTypeBytes.length);
    String recordType = new String(recordTypeBytes, Charset.forName("ibm037"));
        
    System.out.println(recordType+ " => "+new String(data, Charset.forName("ibm037")) );

  }
}
