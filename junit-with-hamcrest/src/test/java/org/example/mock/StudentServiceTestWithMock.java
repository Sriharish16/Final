package org.example.mock;

import org.example.service.Student;
import org.example.service.StudentService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StudentServiceTestWithMock {

	
	//THis method is used to verify the no.of objects has passed using lastAdded element and count;
	
	@DisplayName(value="Test verify Add Method with Mock")
	
	@Test
	void testAddWithMock() {
		StudentServiceMock mock= new StudentServiceMock();
		StudentService service= new StudentService(mock);
		
		Student  kavi= new Student(892,"Kavitha");
		Student kavya=new Student(893,"Kavya");
		
				service.add(kavi);
				service.add(kavya);
				mock.verify(kavya, 2);
			//	mock.verify(kavya, 3);
		
		
	}
}
