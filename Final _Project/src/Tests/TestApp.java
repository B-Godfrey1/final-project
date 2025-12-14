package Tests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import milestone1.ContactService;
import milestone1.test.AfterEach;
import milestone1.test.DisplayName;
import milestone1.Contact;
public class TestApp {
    
	@AfterEach
	void tearDown() throws Exception {
		ContactService.contactList.clear();
	}

	/**
	 Test the Add Contact Feature to se of it works
	 */
	@DisplayName("Test addContact")
	@Test
	public void testAddContact() {

		String firstName = "Joe";
		String lastName = "Swanson";
		String phoneNumber = "123456789";
		String address = "123 Main Street";

		ContactService test = new ContactService();//Added Assert Equals Functions to make sure they work properly
		test.addContact(firstName, lastName, phoneNumber, address);

	ArrayList<Contact> contactListEmpty = new ArrayList<Contact>();
		test.displayContactList();
		Assert.assertNotEquals(ContactService.contactList, contactListEmpty);
	}
	/**
	* Add 4 contacts via addContact delete object at id 1 check that there is no
	* object there
	*/
	@DisplayName("Test deleteContact")			  
	@Test public void testDeleteContact() {
				  
		String firstName = "Type"; 
		String lastName = "R"; 
		String phoneNumber = "77"; 
		String address = "55 North Avenue";
		ContactService test = new ContactService();
		
		test.addContact(firstName, lastName, phoneNumber, address);
        test.addContact(firstName, lastName, phoneNumber, address);
        test.addContact(firstName, lastName, phoneNumber, address);
        test.addContact(firstName, lastName, phoneNumber, address);
        
		test.deleteContact("1");	
		ArrayList<Contact> contactListEmpty = new ArrayList<Contact>();
		test.displayContactList();
		Assert.assertEquals(ContactService.contactList, contactListEmpty);		 
	}
	/**
	 * create a contact and then validate the phone number
	 * edit the phone and re validate
	 */
	@DisplayName("Test editing a phone number")
	@Test
	public void testEditPhone() {
		
		String firstName = "Hanna"; 
		String lastName = "Montana"; 
		String phoneNumber = "000000000"; 
		String address = "12 Hollywood";
		  
		ContactService test = new ContactService();
		test.addContact(firstName, lastName, phoneNumber, address);
		test.editNumber("0", "1987654321");
		assertEquals("1987654321", test.getContact("0").getNumber());
	}
	/**
	 * create a contact and then validate the Last name
	 * edit the last name and re validate
	 */
	@DisplayName("Testing editing the last name")
	@Test
	public void testEditLast() {
		
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
	public void testEditFirst() {
		
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
	public void testEditAddress() {
		
		String firstName = "oh"; 
		String lastName = "no bro"; 
		String phoneNumber = "3"; 
		String address = "12N Main Street";
		ContactService test = new ContactService();
		test.addContact(firstName, lastName, phoneNumber, address);
		test.editAddress("0", "Test_Address");
		assertEquals("Test_Address",test.getContact("0").getAddress());
	}
	 ////More Tests
	 /// ////
	 /// Wanted to see if the same tests ran would produce the same results or if they would break, 
	 // as sometimes code runs for one run, but it should be ablew to
	



	 /**
	 Test the Add Contact Feature to se of it works
	 */
	@DisplayName("Test addContact")
	@Test
	public void testAddContact2() {

		String firstName = "Joe";
		String lastName = "Swanson";
		String phoneNumber = "123456789";
		String address = "123 Main Street";

		ContactService test = new ContactService();//Added Assert Equals Functions to make sure they work properly
		test.addContact(firstName, lastName, phoneNumber, address);

	ArrayList<Contact> contactListEmpty = new ArrayList<Contact>();
		test.displayContactList();
		Assert.assertNotEquals(ContactService.contactList, contactListEmpty);
	}
	/**
	* Add 4 contacts via addContact delete object at id 1 check that there is no
	* object there
	*/
	@DisplayName("Test deleteContact")			  
	@Test public void testDeleteContact2() {
				  
		String firstName = "Type"; 
		String lastName = "R"; 
		String phoneNumber = "77"; 
		String address = "55 North Avenue";
		ContactService test = new ContactService();
		
		test.addContact(firstName, lastName, phoneNumber, address);
        test.addContact(firstName, lastName, phoneNumber, address);
        test.addContact(firstName, lastName, phoneNumber, address);
        test.addContact(firstName, lastName, phoneNumber, address);
        
		test.deleteContact("1");	
		ArrayList<Contact> contactListEmpty = new ArrayList<Contact>();
		test.displayContactList();
		Assert.assertEquals(ContactService.contactList, contactListEmpty);		 
	}
	/**
	 * create a contact and then validate the phone number
	 * edit the phone and re validate
	 */
	@DisplayName("Test editing a phone number")
	@Test
	public void testEditPhone2() {
		
		String firstName = "Hanna"; 
		String lastName = "Montana"; 
		String phoneNumber = "000000000"; 
		String address = "12 Hollywood";
		  
		ContactService test = new ContactService();
		test.addContact(firstName, lastName, phoneNumber, address);
		test.editNumber("0", "1987654321");
		assertEquals("1987654321", test.getContact("0").getNumber());
	}
	/**
	 * create a contact and then validate the Last name
	 * edit the last name and re validate
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

