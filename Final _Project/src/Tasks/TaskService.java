package Tasks;
import java.util.ArrayList;
public class TaskService {
   int numCount=0;
   public static ArrayList<Task>TaskList = new ArrayList<Task>();
    
   
   public void Add_Task(String CustomerName, String Description){
     
		
            String stringID = Integer.toString(numCount);
            
            Task newTask = new Task(stringID, CustomerName, Description);
            TaskList.add(newTask);
            ++numCount;
    }
    public void DeleteTask(String CustomerID){
        String ID=CustomerID;
        for(int i = 0; i < TaskList.size(); i++) {
                if(TaskList.get(i).getCustomerID() == ID) {
                        TaskList.remove(i);
}
}

}

public void editCustomerName(String CustomerID, String CustomerName) {
        for(Task iter : TaskList) {
                if(Integer.valueOf(iter.getCustomerID()) == Integer.valueOf(CustomerID)) {
                        iter.setCustomerName(CustomerName);	
}
}
}
public void editDescription(String CustomerID, String Description) {
        for(Task iter : TaskList) {
                if(Integer.valueOf(iter.getCustomerID()) == Integer.valueOf(CustomerID)) {
                        iter.setDescription(Description);	
}
}
}

public void displayTaskList() {
        for (int counter = 0; counter < TaskList.size(); counter++) {
                System.out.println("\t Task ID: " + TaskList.get(counter).getCustomerID());
                System.out.println("\t Task Name: " + TaskList.get(counter).getCustomerName());
                System.out.println("\t Task Description: " + TaskList.get(counter).getDescription());
        }
}

public Task getTask(String taskID) {
        Task task = new Task(null, null,null);
        for (int counter = 0; counter < TaskList.size(); counter++) {
                if (TaskList.get(counter).getCustomerID().contentEquals(taskID)) {
                        task = TaskList.get(counter);
                }
        }
        return task;
}
}   
