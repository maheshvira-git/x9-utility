package com.mahesh.banking.x9.parser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.LinkedList;
import java.util.List;

import com.mahesh.banking.x9.processor.X9RecordProcessor;

public class X9Parser {

  private static final int MAX_RECORD_LENGTH_IN_FILE = 1_000_000;

  private final List<X9RecordProcessor> processors = new LinkedList<>();

  public X9Parser addProcessor(X9RecordProcessor processor) {
    processors.add(processor);
    return this;
  }

  public void parse(InputStream inputStream) throws IOException {

    byte[] first4Bytes = new byte[4];

    int len = 0;

    while((len = inputStream.readNBytes(first4Bytes, 0, first4Bytes.length)) != 0) {
         
      ByteBuffer recordSizeBuffer = ByteBuffer.wrap(first4Bytes);
      int recSize = recordSizeBuffer.getInt();
    
      if (recSize > MAX_RECORD_LENGTH_IN_FILE) {
        throw new IOException("Record size " + recSize + " exceeds max limit of " + MAX_RECORD_LENGTH_IN_FILE);
      }

      byte [] data = new byte[recSize];
      
      inputStream.readNBytes(data, 0, data.length);

      X9RecordParser.parseRecord(data);
      
    }

    
 
      


  }

}
