package com.mahesh.banking.x9.parser;

import java.io.IOException;

import org.junit.jupiter.api.Test;

public class X9ParserTest {

    @Test
  public void testParseFile() throws IOException {
    
    java.io.InputStream inputStream = this.getClass().getResourceAsStream("/x9-sample/x937 dstu.x9");

    X9Parser parser = new X9Parser();
    parser.parse(inputStream);

  }

}
