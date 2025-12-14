package Tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class AppointmentServiceTests {
    @Test
	@DisplayName("Test to update task name")
	
	public void test_EditDate() {
		Appointments.AppointmentService service = new Appointments.AppointmentService();
		service.Add_Appointment("12212030", "Description");
		service.editDate("0", "12252030");
		service.displayAppointmentList();
		assertEquals("12302030", service.getAppointment("0").getDate());
        
	}

	@Test
	@DisplayName("Test to update task description.")
	public void test_editDescription() {
		Appointments.AppointmentService service = new Appointments.AppointmentService();
		service.Add_Appointment("12222030", "Description");
		service.editDescription("1", "Name");
		service.displayAppointmentList();
		assertEquals("Name", service.getAppointment("1").getDescription());
	}
	

	@Test
	@DisplayName("Test to ensure that the service correctly deletes tasks.")
	public void testDeleteContact() {
		Appointments.AppointmentService service = new Appointments.AppointmentService();
		service.Add_Appointment("Task Name", "Description");
		service.DeleteAppointment("2");
		service.displayAppointmentList();

	}

	@Test
	@DisplayName("Test to ensure that the service can add a task.")

	public void testAddContact() {
		Appointments.AppointmentService service = new Appointments.AppointmentService();
		service.Add_Appointment("11112025", "Description");
		service.displayAppointmentList();
      
	}
}


