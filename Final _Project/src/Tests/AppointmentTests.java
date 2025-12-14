package Tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;
import Appointments.Appointments;
import org.junit.Test;
public class AppointmentTests {
    @Test
	@DisplayName("Task ID cannot have more than 10 characters")
	public void testAppIDWithMoreThanTenCharacters() {
		Appointments app = new Appointments("ID","Name", "Description");
		if (app.getAppointmentID().length() > 10) {
			fail("Task ID has more than 10 characters.");
		}
		
	}

	

	@Test
	@DisplayName(" Description cannot have more than 50 characters")
	public void test_App_Desc_Over_Fifty_Char() {
		Appointments app = new Appointments("ID","12292024", 
				 "123456789 is another nine characters long" 
				+ "123456789 is another nine characters long"
				+ "123456789 is another nine characters long");
		if (app.getDescription().length() < 50) {
			fail("Task Description has more than 50 characters.");
		}
	}

	
	@Test
	@DisplayName("Task Description shall not be null")
	public void test_AppDescription_Not_Null() {
		Appointments app = new Appointments("ID","Name",null);
		assertNotNull(app.getDescription(), "Task Description was null.");
	}
}
