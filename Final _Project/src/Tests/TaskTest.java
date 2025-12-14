package Tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.Test;

import Tasks.Task;

public class TaskTest {
    /*
     * Tests for the task class to see if they are functioning as they should
     * Test conducted to see if the items fail which they not should all not.
     * the legnths are controlled in the Tasks so this should not be a failing point.
     */
	@Test
	@DisplayName("Task ID cannot have more than 10 characters")
	public void testTaskIDWithMoreThanTenCharacters() {
		Task task = new Task("ID","Name", "Description");
		if (task.getCustomerID().length() > 10) {
			fail("Task ID has more than 10 characters.");
		}
	}

	@Test
	@DisplayName("Task Name cannot have more than 20 characters")
	public void testTaskNameWithMoreThanTwentyCharacters() {
		Task task = new Task("ID","OllyOllyOxenFreeOllyOllyOxenFree", "Description");
		if (task.getCustomerName().length() > 20) {
			fail("Task Name has more than 20 characters.");
		}
	}

	@Test
	@DisplayName("Task Description cannot have more than 50 characters")
	public void test_Task_Desc_Over_Fifty_Char() {
		Task task = new Task("ID","Name", "123456789 is nine characters long" 
				+ "123456789 is another nine characters long" 
				+ "123456789 is another nine characters long"
				+ "123456789 is another nine characters long");
		if (task.getDescription().length() < 50) {
			fail("Task Description has more than 50 characters.");
		}
	}

	@Test
	@DisplayName("Task Name shall not be null")
	public void test_Task_Name_Not_Null() {
		Task task = new Task("ID","Name","Description");
		assertNotNull(task.getCustomerName(), "Task Name was null.");
	}
	
	@Test
	@DisplayName("Task Description shall not be null")
	public void test_TaskDescription_Not_Null() {
		Task task = new Task("ID","Name",null);
		assertNotNull(task.getDescription(), "Task Description was null.");
	}
}
