package Appointments;
import java.util.ArrayList;
public class AppointmentService {
    


   int numCount=0;
   public static ArrayList<Appointments>AppointmentList = new ArrayList<Appointments>(); //List of appointments
    
   //add task to the system
   public void Add_Appointment(String Date, String Description){
     
		
            String stringID = Integer.toString(numCount);
            
            Appointments newAppointment = new Appointments(stringID, Date, Description);
            AppointmentList.add(newAppointment);
            ++numCount;
    }
    public void DeleteAppointment(String AppointmentID){
        String ID=AppointmentID;
        for(int i = 0; i < AppointmentList.size(); i++) {
                if(AppointmentList.get(i).getAppointmentID() == ID) {
                        AppointmentList.remove(i);
}
}

}

public void editDate(String AppointmentID, String Date) {
        for(Appointments iter : AppointmentList) {
                if(Integer.valueOf(iter.getAppointmentID()) == Integer.valueOf(AppointmentID)) {
                        iter.setDate(Date);	
}
}
}
public void editDescription(String AppointmentID, String Description) {
        for(Appointments iter : AppointmentList) {
                if(Integer.valueOf(iter.getAppointmentID()) == Integer.valueOf(AppointmentID)) {
                        iter.setDescription(Description);	
}
}
}

public void displayAppointmentList() {
        for (int counter = 0; counter < AppointmentList.size(); counter++) {
                System.out.println("\t Appointment ID: " + AppointmentList.get(counter).getAppointmentID());
                System.out.println("\t Appointment Date: " + AppointmentList.get(counter).getDate());
                System.out.println("\t Appointment Description: " + AppointmentList.get(counter).getDescription());
        }
}

public Appointments getAppointment(String AppointmentID) {
        Appointments app = new Appointments(null, null,null);
        for (int counter = 0; counter < AppointmentList.size(); counter++) {
                if (AppointmentList.get(counter).getAppointmentID().contentEquals(AppointmentID)) {
                        app= AppointmentList.get(counter);
                }
        }
        return app;
}
}
 

