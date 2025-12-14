package Tests;

/*
 * Java Tests to test all the task service information.
 * All edit and deleting functions are tested and an assert equals.
 * is stated to see where failing points are.
 * Information is tested to see with information that would pass as well as fail.
 */

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TaskServiceTest {


	
	@Test
	@DisplayName("Test to update task name")
	
	public void test_EditCustomerName() {
		Tasks.TaskService service = new Tasks.TaskService();
		service.Add_Task("Task Name", "Description");
		service.editCustomerName("3", "Task Name");
		service.displayTaskList();
		assertEquals("Task Name", service.getTask("0").getCustomerName());
        
	}

	@Test
	@DisplayName("Test to update task description.")
	public void test_editDescription() {
		Tasks.TaskService service = new Tasks.TaskService();
		service.Add_Task("Name", "Description");
		service.editDescription("1", "Name");
		service.displayTaskList();
		assertEquals("Name", service.getTask("1").getDescription());
	}
	

	@Test
	@DisplayName("Test to ensure that the service correctly deletes tasks.")
	// I cant figure out this list
	public void testDeleteContact() {
		Tasks.TaskService service = new Tasks.TaskService();
		service.Add_Task("Task Name", "Description");
		service.DeleteTask("0");
		service.displayTaskList();

	}

	@Test
	@DisplayName("Test to ensure that the service can add a task.")

	public void testAddContact() {
		Tasks.TaskService service = new Tasks.TaskService();
		service.Add_Task("Task Name", "Description");
		service.displayTaskList();
       assertEquals("Task Name",service.getTask("3").getCustomerName());
	}



	/////////////////////////////////////
	/// ////////////////////////////
	/// New tests Added for CS 499
	/// Again seeing if it will break if i do the same tests twice, as if it fails the second time, there may be a issue that was not caught
	@DisplayName("Test to update task name")
	
	public void test_EditCustomerName2() {
		Tasks.TaskService service = new Tasks.TaskService();
		service.Add_Task("Task Name", "Description");
		service.editCustomerName("3", "Task Name");
		service.displayTaskList();
		assertEquals("Task Name", service.getTask("3").getCustomerName());
        
	}

	@Test
	@DisplayName("Test to update task description.")
	public void test_editDescription2() {
		Tasks.TaskService service = new Tasks.TaskService();
		service.Add_Task("Name", "Description");
		service.editDescription("1", "Name");
		service.displayTaskList();
		assertEquals("Name", service.getTask("1").getDescription());
	}
	

	@Test
	@DisplayName("Test to ensure that the service correctly deletes tasks.")
	// I cant figure out this list
	public void testDeleteContact2() {
		Tasks.TaskService service = new Tasks.TaskService();
		service.Add_Task("Task Name", "Description");
		service.DeleteTask("0");
		service.displayTaskList();

	}

	@Test
	@DisplayName("Test to ensure that the service can add a task.")

	public void testAddContact2() {
		Tasks.TaskService service = new Tasks.TaskService();
		service.Add_Task("Task Name", "Description");
		service.displayTaskList();
       assertEquals("Task Name",service.getTask("3").getCustomerName());
	}
	
}
