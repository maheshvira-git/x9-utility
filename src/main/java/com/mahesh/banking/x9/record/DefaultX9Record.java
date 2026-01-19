package com.mahesh.banking.x9.record;

import com.mahesh.banking.x9.model.X9Record;

public abstract class DefaultX9Record implements X9Record {

  abstract public byte[] toByteArray();
}
