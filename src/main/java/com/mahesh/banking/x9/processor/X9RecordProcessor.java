package com.mahesh.banking.x9.processor;

import com.mahesh.banking.x9.model.X9Record;
import com.mahesh.banking.x9.record.X9AccountsTotal40Record;
import com.mahesh.banking.x9.record.X9BoxSummary75Record;
import com.mahesh.banking.x9.record.X9BundleControl70Record;
import com.mahesh.banking.x9.record.X9BundleHeader20Record;
import com.mahesh.banking.x9.record.X9CashLetterControl90Record;
import com.mahesh.banking.x9.record.X9CashLetterHeader10Record;
import com.mahesh.banking.x9.record.X9CheckDetail25Record;
import com.mahesh.banking.x9.record.X9CheckDetailAddendumA26Record;
import com.mahesh.banking.x9.record.X9CheckDetailAddendumB27Record;
import com.mahesh.banking.x9.record.X9CheckDetailAddendumC28Record;
import com.mahesh.banking.x9.record.X9CreditReconciliation61Record;
import com.mahesh.banking.x9.record.X9DigitalCertificate64Record;
import com.mahesh.banking.x9.record.X9FileControl99Record;
import com.mahesh.banking.x9.record.X9FileHeader01Record;
import com.mahesh.banking.x9.record.X9ImageTestDetail56Record;
import com.mahesh.banking.x9.record.X9ImageTestSummary55Record;
import com.mahesh.banking.x9.record.X9ImageViewAnalysis54Record;
import com.mahesh.banking.x9.record.X9ImageViewData52Record;
import com.mahesh.banking.x9.record.X9ImageViewDetail50Record;
import com.mahesh.banking.x9.record.X9NonHitTotal41Record;
import com.mahesh.banking.x9.record.X9ReturnDetail31Record;
import com.mahesh.banking.x9.record.X9ReturnDetailAddendumA32Record;
import com.mahesh.banking.x9.record.X9ReturnDetailAddendumB33Record;
import com.mahesh.banking.x9.record.X9ReturnDetailAddendumC34Record;
import com.mahesh.banking.x9.record.X9ReturnDetailAddendumD35Record;
import com.mahesh.banking.x9.record.X9RoutingNumberSummary85Record;
import com.mahesh.banking.x9.record.X9User68Record;

public interface X9RecordProcessor {

  void process(X9Record record);
  void process01Record(X9FileHeader01Record record);
  void process10Record(X9CashLetterHeader10Record record);
  void process20Record(X9BundleHeader20Record record);  
  void process25Record(X9CheckDetail25Record record);
  void process26Record(X9CheckDetailAddendumA26Record record);
  void process27Record(X9CheckDetailAddendumB27Record record);
  void process28Record(X9CheckDetailAddendumC28Record record);
  void process31Record(X9ReturnDetail31Record record);
  void process32Record(X9ReturnDetailAddendumA32Record record);
  void process33Record(X9ReturnDetailAddendumB33Record record);
  void process34Record(X9ReturnDetailAddendumC34Record record);
  void process35Record(X9ReturnDetailAddendumD35Record record);
  void process40Record(X9AccountsTotal40Record record);
  void process41Record(X9NonHitTotal41Record record);
  void process50Record(X9ImageViewDetail50Record record);
  void process52Record(X9ImageViewData52Record record);
  void process54Record(X9ImageViewAnalysis54Record record);
  void process55Record(X9ImageTestSummary55Record record);
  void process56Record(X9ImageTestDetail56Record record);
  void process61Record(X9CreditReconciliation61Record record);
  void process64Record(X9DigitalCertificate64Record record);
  void process68Record(X9User68Record record);
  void process70Record(X9BundleControl70Record record);
  void process75Record(X9BoxSummary75Record record);
  void process85Record(X9RoutingNumberSummary85Record record);
  void process90Record(X9CashLetterControl90Record record);
  void process99Record(X9FileControl99Record record); 
  
} 
