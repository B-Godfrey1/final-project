package milestone1;

import java.util.concurrent.atomic.AtomicLong;

public class Contact {
    //Start off by creating blank objects to be used.
private String FirstName;
private String LastName;
private String ContactID;
private String Address;
private static AtomicLong idCounter = new AtomicLong();
private String Number;

//Create the Contact and loop through so when creating object, will make sure all aspects are correct and meet customer requirements
public Contact(String FirstName,String LastName, String Address,String Number){
//Creating A Contact ID
  this.ContactID=String.valueOf(idCounter.getAndIncrement());

if (FirstName ==null || FirstName.isEmpty()){
    FirstName="null";
}
else if(FirstName.length()>10){
this.FirstName=FirstName.substring(0,10);
}
else{
this.FirstName=FirstName;
}
if (LastName ==null || LastName.isEmpty()){
    LastName="null";
}
else if(LastName.length()>10){
this.LastName=LastName.substring(0,10);
}
else{
    this.LastName=LastName;
}
if (Address ==null || Address.isEmpty()){
    Address="null";
}
else if(Address.length()>30){
this.Address=Address.substring(0,30);
}
// Create Phone Number
else{
    this.Address=Address;
}
if (Number==null ||Number.isEmpty()){
    Number="1234567890";
}
    else if(Number.length()>10){
            this.Address=Address.substring(0,10);
    }

}
//Getters########################################################################################################################################################################//#endregion
            //Get First Name
            //These are mainly for changing names for customers and updating contact information.
public String getFirstName(){
   return FirstName;
}

//Get Last Name
public String getLastName(){
    return LastName;
}
//Address Getter
public String getAddress(){
    return Address;
}
// Phone Number Getter
public String getNumber(){
   return Number;
}
public int getContactID(){
    return Integer.valueOf(ContactID);
}
//Setters####################################################################################################################################################################
//Used after getting new first name to set the first name.
//Create First Name
public void setFirstName(String FirstName){
       if (FirstName ==null || FirstName.isEmpty()){
            FirstName="null";
       }
       else if(FirstName.length()>10){
        this.FirstName=FirstName.substring(0,10);
       }
       else{
        this.FirstName=FirstName;
       }
    }

//Create Last Name
public void setLastName(String LastName){
  if (LastName ==null || LastName.isEmpty()){
    LastName="null";
}
else if(LastName.length()>10){
this.LastName=LastName.substring(0,10);
}
else{
    this.LastName=LastName;
}
}

//Create Address
public void setAddress(String Address){
  if (Address ==null || Address.isEmpty()){
    Address="null";
}
else if(Address.length()>30){
this.Address=Address.substring(0,30);
}
// Create Phone Number
else{
    this.Address=Address;
}

}
public void setNumber(String Number){
    if (Number==null ||Number.isEmpty()){
        Number="1234567890";
    }
        else if(Number.length()>10){
                this.Address=Address.substring(0,10);
        }
        else{
            this.Number=Number;
        }
    }

}




