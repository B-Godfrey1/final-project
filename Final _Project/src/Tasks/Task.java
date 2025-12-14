package Tasks;

import java.util.concurrent.atomic.AtomicLong;

public class Task{
private static AtomicLong Customer = new AtomicLong();
String CustomerName;
String Description;
private final String CustomerID;

//  Setters #############################################################################################################################################
public Task(String CustomerID,String CustomerName,String Description) {
   this.CustomerID = String.valueOf(Customer.getAndIncrement());
	
	
	
	 //Cut Down the CustomerID to 10 digits
	if (CustomerID != null && !CustomerID.isEmpty()) {
         if (CustomerID.length() > 10) {
            CustomerID = CustomerID.substring(0, 10);
         } 
         
         }else { //Just in case a new one has to be made as customer ID is empty
        	 AtomicLong Customer=new AtomicLong();
            CustomerID = String.valueOf(Customer.getAndIncrement());
	
         
        	 if (this.CustomerID.length()>10){
        		 CustomerID = CustomerID.substring(0, 10); 
        	 }
         }
	
	//Check and make sure CustomerName fits the bill//////////////////////////////
	 if (CustomerName != null && !CustomerName.isEmpty()) {
         if (CustomerName.length() > 20) {
            this.CustomerName = CustomerName.substring(0, 20);
         } else {
            this.CustomerName = CustomerName;
         }
      } else {
         CustomerName = "Empty Name";
}
	 ////Make sure the description matches the mark
	 if (Description != null && !Description.isEmpty()) {
         if (Description.length() > 50) {
            this.Description = Description.substring(0, 50);
         } else {
            this.Description = Description;
         }
      } else {
         CustomerName = "No Description Given";
}
	 
	 
}

///  Getter Methods #################################################################################################################################
public String getCustomerID() {
	return String.valueOf(CustomerID);
}
public String getCustomerName() {
	return this.CustomerName;
}
public String getDescription() {
	return this.Description;
}



//Setter Methods######################################################################################################################
//set the CustomerName
public void setCustomerName(String CustomerName){
   if (CustomerName != null && !CustomerName.isEmpty()) {
      if (CustomerName.length() > 20) {
         this.CustomerName = CustomerName.substring(0, 20);
      } else {
         this.CustomerName = CustomerName;
      }
   } else {
      CustomerName = "Empty Name";
}
}

//Set Description Method####################################################################################################
public void setDescription(String Description){
   if (Description != null && !Description.isEmpty()) {
      if (Description.length() > 50) {
         this.Description = Description.substring(0, 50);
      } else {
         this.Description = Description;
      }
   } else {
      CustomerName = "No Description Given";
}
}
}