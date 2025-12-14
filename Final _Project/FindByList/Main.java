import java.util.*;

import java.util.List;


class MyQueue {
    // Store Elements
           
              
   //Made the list a 2d array
      List<List<String>>TwoDList=new ArrayList<>();
      
    

    //The alogorithm is a simple one that sorts out the clients so they are in order to be taken out of the stack
  public void addContact(String ClientId,String firstName, String lastName,
			String phoneNumber, String address,String Date) {
		
        int Date1=Integer.valueOf(Date);

        for( int i=0; i< TwoDList.size();i++){
            String c=TwoDList.get(i).get(5);
            int datew=Integer.valueOf(Date1);
            int w=Integer.valueOf(c);
            if(w>datew){
                TwoDList.add(i+1,(new ArrayList<String>(Arrays.asList(ClientId,firstName,lastName,phoneNumber,address,Date))));
            }

               

                    
            
        
        }
  
      // Delete the item from queue
   
} ;
public void DeleteContact(String ClientID){ ///if you need to delete a specific contact
 for( int i=0; i< TwoDList.size();i++){
            String c=TwoDList.get(i).get(1);
           
            if(c==ClientID){
                TwoDList.remove(i);
}
 }
}
public List<String> getCOntact(){///Return the information of the first contact
    return TwoDList.get(0);
}
public void ContactPop(){///Method so that when a contact is finished it removesthe first, as it is first in first out so there is no need to go up the stack
    List<String> x =TwoDList.get(0);
    TwoDList.remove(x);
}
};


