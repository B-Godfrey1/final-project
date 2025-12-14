package Appointments;

import java.text.SimpleDateFormat;
import java.util.concurrent.atomic.AtomicLong;  
import java.util.Date;  
public class Appointments{
private static AtomicLong Appointment = new AtomicLong();
String CustomerName;
String Description;
String Date;
Date currdate = new Date();  
SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyy");  
String strDate= formatter.format(currdate);  
int intDate=Integer.valueOf(strDate);


private final String AppointmentID;

public Appointments(String AppointmentID,String Date,String Description) {
    this.AppointmentID = String.valueOf(Appointment.getAndIncrement());
     
    if (AppointmentID != null && !AppointmentID.isEmpty()) {
        if (AppointmentID.length() > 10) {
           AppointmentID = AppointmentID.substring(0, 10);
        } 
        
        }else { //Just in case a new one has to be made as customer ID is empty
            AtomicLong Customer=new AtomicLong();
           AppointmentID = String.valueOf(Customer.getAndIncrement());
   
        
            if (this.AppointmentID.length()>10){
                AppointmentID = AppointmentID.substring(0, 10); 
            }
        }

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
///getter methods
public String getAppointmentID() {
	return String.valueOf(AppointmentID);
}
public String getDate() {
	return this.Date;
}
public String getDescription() {
	return this.Description;
}

///settermethods
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
///add another day if anything
 public void setDate(String Date){

    if (Date != null && !Date.isEmpty()) {
        if (Integer.valueOf(Date)< intDate){
            int newDate= Integer.valueOf(Date)+50000;
            this.Date=String.valueOf(newDate);
        }
          else{this.Date = Date;}
    } 
  
 }
}
