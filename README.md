# B-Godfrey1.github.io
## Final Project

## Introduction
My name is Brandon Godfrey, and I am a computer science grad from Southern New Hamshire University. Below I have made a self assesment to demonstrate my computer science abilities in the key areas of Databases, Security, and Algorithms

**Brandon Godfrey Self Assesment**

Starting out my computer science journey was a curve ball to say the least. For all of what I remember, what I truly wanted to do was be a marine biologist. I would watch catalogs of documentaries pertaining to ocean life, as well as read all the time about marine life and marine processes. Computers were something that I was passionate about, but not to the extremes as ocean life. I feel as though when I became a teenager spending some time around some computer scientists, and tinkering with small projects, as well as getting into game design was the pushing force for getting into computer science. I would play these games and had the desire to learn how they worked, which started my passion up, but then taking those skills further to see what else I could use them for, whether it be automating tasks, or even small tasks like web scrapping, just learning how it all worked.
	
Working through the course assignments thus far as well as developing an ePortfolio has helped to show my skills, as it showcases my ability to circle back into course projects and think of them in a professional way to evaluate what else thy need. An example would be thinking about my database in a security sense, it demonstrates my thought process as I figure that it is not advisable to simply let anyone log into a database, so I added a login process. I as well added hashing for storing any passwords, because passwords should never be stored without hashing, or someone with access may be able to see it. 
	
	
How it showcased my strengths for professional goals is that it shows my thought process beyond the exact task, to what else it may need. For example, one file I made was a demonstration of creating a task making program. It started life as an ArrayList, but I went back and created a FIFO organizer for it, as its for office scenarios, thus it was necessary for it to be FIFO instead of an unorganized list. I then added a call to delete after the list it called, deleting the first item, but when adding, adds at the back of the list, as those would be later in the day. These projects have also shown my sense of security when it comes to testing and coverage of products, as I feel it can be better to go overboard with tests, as it means catching every possible error and bug, before its pushed to consumers. I’ve watched many of these bugs be detrimental for companies, especially when it comes to security, leading to distrust from consumers, and ruined reputations for companies. This is why I believe me showcasing my ability to test as if I’m a tester instead of a developer is crucial.

These strengths are useful for situations such as working and collaborating on teams, as having individual ideas for how the project could be better helps in the task of creating a better product for buyers and users. It as well helps for stakeholders, as they may not be the ones making the product, but knowing that the product is a culmination of finding and fixing errors, as well as checking over work will mean the best product will be on market. 

These as well showcase my ability to combine database and algorithms as well as security. There are many algorithms to choose from for any given task, but looking for the one to not only get the task done the fastest, but also the best and have potential to scale is key. An example would be managing flights for an airport. It might seem grandiose, but simplifying it down, we see that it really is just a FIFO list, but on a bigger operation, while streaming services would use trees and AI algorithms for their sorting methods. Using the right algorithm is key to an experience, whether we see it, we can feel it. 
	
Database though process comes down to how its managed and set up, as well as how to interact with it. Setting up a data base for customer use may be a simple task, but adding security on top of it is key, which is why adding layers of protection is necessary, as databases are a prime way customer information is stolen.

All this comes together to show how I can think beyond the exact task, to incorporate components that will make the experience faster and better for the users.

Below Are examples of how I’ve demonstrated the principles of Databases, Security and Algorithms into practice.
## Databases 
For my example for databases, I wanted to secure interactions between user and database.


The artifact is my final project for my cs320 class. The point of it is to go through a database to show the locations of all the animals in the animal shelter. There is login for it in the name of just putting your name and password in the code itself, but I fell as though a login screen is justified.
Justify the inclusion of the artifact in your ePortfolio. Why did you select this item? What specific components of the artifact showcase your skills and abilities in software development? How was the artifact improved?

This demonstrates my ability to incorporate a database into my components, as well as interact with and problem solve using databases. The components I wanted to interact with are to add a login page for the code, as to not have to manually write it in every time, to make the code easier.

I as well added a register button to register users. I feel though that if this were a proper use, then I would have some key so that only people with access can actually make an account to log in. As well as a forgot password button. One note I followed was to not add the password itself, but to make it a hash value, seeing as though some may get access, it will still mean nothing for them.
Now the artifact has the ability to add new users as well as login via a ux instead of relying on hardcoding the items



Starting out, previously it had to be hard coded into the system the username and password as such:
 
 	username = "aacuser"
	password = "SNHU1234"
	Connect to database via CRUD Module
	db = AnimalShelter(username, password) 

This section highlights how I had to previously manually enter the data into the system.

I took the db input but made a input using pythons tkinter to create a logion screen and screen to create a user for the system to login.
<img width="459" height="324" alt="image" src="https://github.com/user-attachments/assets/f1cff596-a0d1-4b32-8018-e974b63d68ba" />
it was made using code:

import tkinter as tk
import mysql.connector
from tkinter import * 
import hashlib
 
	#Called at the button submit act willl continueslly loop until a password and username iin the database is called
	def submitact():
    
    user = Username.get()
    passw = password.get()
 
    print(f"The name entered by you is {user} {passw}")
 
    logintodb(user, passw)
 
	##Code to login for login button
	def logintodb(user, passw):
    
    # If password is entered by the 
    # user
    if passw:
        db = mysql.connector.connect(host ="localhost",
                                     user = user,
                                     password = passw,
                                     db ="AnimalShelter",
                                     port=3000)
        cursor = db.cursor()
        
    # If no password is entered by the
    # user
    else:
        db = mysql.connector.connect(host ="localhost",
                                     user = user,
                                     db ="AnimalShelter",
                                     port=3000)
        cursor = db.cursor()
        
    # A Table in the database
    savequery = "select * from AnimalShelter"
    
    try:
        cursor.execute(savequery)
        myresult = cursor.fetchall()
        
        # Printing the result of the
        # query
        for x in myresult:
            print(x)
        print("Query Executed successfully")
        
    except:
        db.rollback()
        print("Error occurred")




 	###This code is used to register new users via getting the information from the login screen   
	##It will add users to the system to login another time
	def register_user():
        user = Username.get()
        passw = password.get()
 
        connection = mysql.connector.connect(host ="localhost", ##Ini the future with this database I woulkd add an actual place to store all uysernames and passwords.
                                     user = user,
                                     password = password,
                                     db ="AnimalShelter",
                                     port=3000)
        if connection:
            cursor = connection.cursor()
            hashed_password = hashlib.sha256(password.encode()).hexdigest() #SHA 256 is the standard incryption prosess these days
            try:
                sql = "INSERT INTO AnimalShelter(username, password) VALUES (%s, %s)"
                cursor.execute(sql, (user, hashed_password))
                connection.commit()
                print("User registered successfully.")
                return True
            except mysql.connector.Error as err:
                print(f"Error registering user: {err}")
                connection.rollback()
                return False
            finally:
                cursor.close()
                connection.close()
        return False
 

	root = tk.Tk()
	width = root.winfo_screenwidth()
	height = root.winfo_screenheight()
	root.geometry("{}x3{}".format(width,height))
	root.title("Animal Shelter Login Page")
 

	# Defining the first row
	lblfrstrow = tk.Label(root, text ="Username -", )
	lblfrstrow.place(x = 50, y = 20)

	Username = tk.Entry(root, width = 35)
	Username.place(x = 150, y = 20, width = 100)
 
	lblsecrow = tk.Label(root, text ="Password -")
	lblsecrow.place(x = 50, y = 50)

	password = tk.Entry(root, width = 35)
	password.place(x = 150, y = 50, width = 100)

	submitbtn = tk.Button(root, text ="Login", 
                      bg ='blue', command = submitact)
	submitbtn.place(x = 150, y = 135, width = 55)

	regbutton = tk.Button(root, text ="Register", 
                      bg ='blue', command = register_user)
	regbutton.place(x = 0, y = 135, width = 55)

	root.mainloop()

Some things I learned were just simple items like always hash code, as well as interacting with a database to add login values. If I were doing this from scratch though I would add a directory specifically for usernames and passwords, as well as having levels of access so that even if you have access to the database, you can’t simply look up that information. I had difficulties though getting what I had written down into something in code, as I had to look through different approaches to do it as the way to login, vs adding user and password code didn’t always mix properly and threw countless errors.

## Algorithms and Data Structures

The next portion I wanted to talk about was Algorithms.

The artifact was a final project created during my time in cs320. It is an application to create and set appointments for an office setting using Java as the language. It has the files for Appointment, Task, and Contact. Appointment is meant to create and Appointment for the Application and store Appointment details, with Appointment Service being the ways to edit, add and delete the Appointments in the List. Task is meant to create what the task is going to be done. Contact Gets and Sets the Contact Information for Appointments.

I choose this file as it gives me a platform to add some expansion, as it will make the application better. What I did was I added another file to it that makes it so that the Array List can be sorted by the time that it’s scheduled for, and then taken out based on that time. This was to demonstrate how since this is a task application based on appointment time, I made it so that time is sorted earliest to latest, thus the appointment that is next will be the scheduled one, and once you finish it, you can call to pop that one. This is better than the original List that stored everything as a stack randomly, so when you went to actually find an appointment, if its at the top of the list, it has a longer processing time, than if you sort it out, thus the first one is the next, fifo if you will.

previously, all aspects of the code were fed though a Array, thus it was unorganzied, and would slow if the list were bigger:

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
 

Thus I took this approach, and made a 2d list of all the values so they are easier to edit, as well as organize inside of the list. I then had them sorted out in the list

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

        for( int i=0; i< TwoDList.size();i++){ ####This is to make it so that the appointments auto sort by date
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
Reflecting on what I learned, I learned to think of the necessary tools for what such an application need. When coming up with solutions, it should be thought of what tools do I have that produce the fastest outcome, while also being the safest. What I mean is for such an item, what solution can I come up with for an Appointment application that preforms the best, while also being the safest option. I believe for this the answer was a FIFO sorting algorithm as it made the most logical sense. Challenges I faced though were trying to convert an Array into a 2d array and sorting through that, as Java Array List doesn’t always behave as a real list, so many solutions had to be found.
	
##Security
For the last section I will talk about security

The artifact is a final project created during my time in cs320. It is an application to create and set appointments for an office setting using Java as the language. It has the files for Appointment, Task, and Contact. Appointment is meant to create and Appointment for the Application and store Appointment details, with Appointment Service being the ways to edit, add and delete the Appointments in the List. Task is meant to create what the task is going to be done. Contact Gets and Sets the Contact Information for Appointments.

I chose this item as it demonstrates my ability to even in smaller files, find ways to cover all areas of testing, to make it absolute sure that they meet criteria for functionality, as if this were to ship off and I missed an area of coverage, it would mean I did not ship out the best product possible. 

I meet the goals I wanted to create, as the goal was to amp up coverage, and that was completed successfully. How I did that was by not only adding more test coverage cases, mainly seeing if the same coverages would work twice over, but as well going back and adding assert equals cases to all areas, to make sure that the coverages are being covered. Running the tests by themselves can lead to false positives, so making sure to eliminate false positives is a must have.
The process of enhancing the coverages involved going back first off, to add a clause for getContact, as that allowed me to use contact info via contactID to compare for assert equals cases. Then, going over to see if the same cases would work a second time allowed me to make sure that the items were working properly. Challenges that I faced during this were consistently having to go from Sting to Int to String, which I believe to be a piece that can slow performance if this was to be a bigger project, as well as finding a way to compare Lists was a difficulty. I also spent the time looking through stacks to make sure that the items were behaving as normal, as it’s a way for myself to make sure they were working properly. My files also broke a few times so I had to go back to see in other places what it was that caused problems. The end product though is something i know truely works with having 100% coverage, which is above the indusry standard of 90%, which shows how much thought I put into the coverage.

 	*/
	@DisplayName("Testing editing the last name")
	@Test
	public void testEditLast2() {
		
		String firstName = "george"; 
		String lastName = "withers"; 
		String phoneNumber = "9076543210"; 
		String address = "77 Baltimore ave";
		  
		ContactService test = new ContactService();
		test.addContact(firstName, lastName, phoneNumber, address);
		test.editLastName("0", "Test_Name");
		assertEquals("Test_Name",test.getContact("0").getLastName());
		
	}
	/**
	 * create a contact and then validate the first name
	 * edit the first name and re validate
	 */
	@DisplayName("Test editing a first name")
	@Test
	public void testEditFirst2() {
		
		String firstName = "MR"; 
		String lastName = "SPanish"; 
		String phoneNumber = "1234567891"; 
		String address = "12E Main Street";

		ContactService test = new ContactService();
		test.addContact(firstName, lastName, phoneNumber, address);
		
	
		test.editFirstName("0", "Test_First");
		assertEquals("Test_First",test.getContact("0").getFirstName());
	}
	/**
	 * Test to Edit the Address of Customer
	 */
	@DisplayName("Test editing an address")
	@Test
	public void testEditAddress2() {
		
		String firstName = "oh"; 
		String lastName = "no bro"; 
		String phoneNumber = "3"; 
		String address = "12N Main Street";
		ContactService test = new ContactService();
		test.addContact(firstName, lastName, phoneNumber, address);
		test.editAddress("0", "Test_Address");
		assertEquals("Test_Address",test.getContact("0").getAddress());
	}
}



