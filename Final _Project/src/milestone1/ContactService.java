package milestone1;

import java.util.ArrayList;

public class ContactService{
    int IDNum = 0; //

	//create new arraylist to hold the objects
	public static ArrayList<Contact> contactList = new ArrayList<Contact>();
	
	/**
	 * adds a contact at the system controlled index id
	 * @param firstName
	 * @param lastName
	 * @param phoneNumber
	 * @param address
	 */
	public void addContact(String firstName, String lastName,
			String phoneNumber, String address) {
		
		String stringID = Integer.toString(IDNum);
		
		Contact newContact = new Contact(stringID, firstName, lastName, phoneNumber);
		contactList.add(newContact.getContactID(),newContact);
		
		//increment the ID NUM
		++IDNum;

	}
	
	/** 
	 * Deletes the contact as the index ID
	 * @param ID
	 */	
	public void deleteContact(String ID) {
		int intID = Integer.valueOf(ID);


		for(int i = 0; i < ContactService.contactList.size(); i++) {
			if(ContactService.contactList.get(i).getContactID() == intID) {
				contactList.remove(i);
			}
		}
	}
	
	/**
	 * Edits the First Name of the Contact Object at contactID
	 * Uses the setFirstName method
	 * @param contactID
	 * @param firstName
	 */
	public void editFirstName(String contactID, String firstName) {
		for(Contact iter : contactList) {
			if(iter.getContactID() == Integer.valueOf(contactID)) {
				iter.setFirstName(firstName);				
			}			
		}	
	}
	
	/**
	 * Edits the Lame Name of the Contact Object at contactID
	 * Uses the setLastName method
	 * @param contactID
	 * @param lastName
	 */
	public void editLastName(String contactID, String lastName) {
		for(Contact iter : contactList) {
			if(iter.getContactID() == Integer.valueOf(contactID)) {
				iter.setLastName(lastName);				
			}			
		}	
	}
	public void editNumber(String contactID, String phoneNumber) {
		for(Contact iter : contactList) {
			if(iter.getContactID() == Integer.valueOf(contactID)) {
				iter.setNumber(phoneNumber);				
			}			
		}	
	}
	public void editAddress(String contactID, String address) {
		for(Contact iter : contactList) {
			if(iter.getContactID() == Integer.valueOf(contactID)) {
				iter.setAddress(address);				
			}			
        }
    }
		public Contact getContact(String contactsID) {
		Contact contact = new Contact(null, null, null, null);
		for (int counter = 0; counter < contactList.size(); counter++) {
			int contactID=Integer.parseInt(contactsID);
			if (contactList.get(counter).getContactID()==contactID) {
				contact = contactList.get(counter);
			}
		}
		return contact;
	}
	public void displayContactList() {
		for (int counter = 0; counter < contactList.size(); counter++) {
			System.out.println("\t Contact ID: " + contactList.get(counter).getContactID());
			System.out.println("\t First Name: " + contactList.get(counter).getFirstName());
			System.out.println("\t Last Name: " + contactList.get(counter).getLastName());
			System.out.println("\t Phone Number: " + contactList.get(counter).getNumber());
			System.out.println("\t Address: " + contactList.get(counter).getAddress() + "\n");
		}
	}
}