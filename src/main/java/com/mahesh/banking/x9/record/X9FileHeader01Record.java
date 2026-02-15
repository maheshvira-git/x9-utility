package com.mahesh.banking.x9.record;

import com.mahesh.banking.x9.model.X9RecordType;

public class X9FileHeader01Record extends DefaultX9Record {

  private String recordType;
  private String standardLevel;
  private String testFileIndicator;
  private String immediateReceivingPointRoutingNumber;
  private String immediateOriginRoutingNumber;
  private String fileCreationDate;
  private String fileCreationTime;
  private String resendIndicator;
  private String immediateReceivingPoint;
  private String immediateOriginName;
  private String fileIdModifier;
  private String countryCode;
  private String userField;
  private String reserved;

  public X9FileHeader01Record() {
  }

  public enum FileHeader01Field {
    RECORD_TYPE("Record Type", 2, 2, "String"),
    STANDARD_LEVEL("Standard Level", 2, 2, "String"),
    TEST_FILE_INDICATOR("Test File Indicator", 1, 1, "String"),
    IMMEDIATE_RECEIVING_POINT_ROUTING_NUMBER("Immediate Receiving Point Routing Number", 9, 9, "String"),
    IMMEDIATE_ORIGIN_ROUTING_NUMBER("Immediate Origin Routing Number", 9, 9, "String"),
    FILE_CREATION_DATE("File Creation Date", 8, 8, "String"),
    FILE_CREATION_TIME("File Creation Time", 4, 4, "String"),
    RESEND_INDICATOR("Resend Indicator", 1, 1, "String"),
    IMMEDIATE_RECEIVING_POINT("Immediate Receiving Point", 23, 23, "String"),
    IMMEDIATE_ORIGIN_NAME("Immediate Origin Name", 23, 23, "String"),
    FILE_ID_MODIFIER("File ID Modifier", 1, 1, "String"),
    COUNTRY_CODE("Country Code", 2, 2, "String"),
    USER_FIELD("User Field", 2, 2, "String"),
    RESERVED("Reserved", 1, 1, "String");

    private final String fieldName;
    private final int size;
    private final int length;
    private final String dataType;

    FileHeader01Field(String fieldName, int size, int length, String dataType) {
      this.fieldName = fieldName;
      this.size = size;
      this.length = length;
      this.dataType = dataType;
    }

    public String getFieldName() {
      return fieldName;
    }

    public int getSize() {
      return size;
    }

    public int getLength() {
      return length;
    }

    public String getDataType() {
      return dataType;
    }
  }

  @Override
  public byte[] toByteArray() {
    return new byte[0];
  }

  @Override
  public X9RecordType getRecordType() {
    return X9RecordType.FILE_HEADER_01_RCD;
  }

  public String getRecordType_Field() {
    return recordType;
  }

  public void setRecordType_Field(String recordType) {
    this.recordType = recordType;
  }

  public String getStandardLevel() {
    return standardLevel;
  }

  public void setStandardLevel(String standardLevel) {
    this.standardLevel = standardLevel;
  }

  public String getTestFileIndicator() {
    return testFileIndicator;
  }

  public void setTestFileIndicator(String testFileIndicator) {
    this.testFileIndicator = testFileIndicator;
  }

  public String getImmediateReceivingPointRoutingNumber() {
    return immediateReceivingPointRoutingNumber;
  }

  public void setImmediateReceivingPointRoutingNumber(String immediateReceivingPointRoutingNumber) {
    this.immediateReceivingPointRoutingNumber = immediateReceivingPointRoutingNumber;
  }

  public String getImmediateOriginRoutingNumber() {
    return immediateOriginRoutingNumber;
  }

  public void setImmediateOriginRoutingNumber(String immediateOriginRoutingNumber) {
    this.immediateOriginRoutingNumber = immediateOriginRoutingNumber;
  }

  public String getFileCreationDate() {
    return fileCreationDate;
  }

  public void setFileCreationDate(String fileCreationDate) {
    this.fileCreationDate = fileCreationDate;
  }

  public String getFileCreationTime() {
    return fileCreationTime;
  }

  public void setFileCreationTime(String fileCreationTime) {
    this.fileCreationTime = fileCreationTime;
  }

  public String getResendIndicator() {
    return resendIndicator;
  }

  public void setResendIndicator(String resendIndicator) {
    this.resendIndicator = resendIndicator;
  }

  public String getImmediateReceivingPoint() {
    return immediateReceivingPoint;
  }

  public void setImmediateReceivingPoint(String immediateReceivingPoint) {
    this.immediateReceivingPoint = immediateReceivingPoint;
  }

  public String getImmediateOriginName() {
    return immediateOriginName;
  }

  public void setImmediateOriginName(String immediateOriginName) {
    this.immediateOriginName = immediateOriginName;
  }

  public String getFileIdModifier() {
    return fileIdModifier;
  }

  public void setFileIdModifier(String fileIdModifier) {
    this.fileIdModifier = fileIdModifier;
  }

  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public String getUserField() {
    return userField;
  }

  public void setUserField(String userField) {
    this.userField = userField;
  }

  public String getReserved() {
    return reserved;
  }

  public void setReserved(String reserved) {
    this.reserved = reserved;
  }
}
