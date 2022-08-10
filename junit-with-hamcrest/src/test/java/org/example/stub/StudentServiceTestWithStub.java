package org.example.stub;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.service.StudentService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.*;

public class StudentServiceTestWithStub {
	
	@Test
	@DisplayName("Test findAll Method with Stub to return All the elemts added")
	void FindAllMethod(){
		
		StudentRepositoryStub stub= new StudentRepositoryStub();
		StudentService service = new StudentService(stub);
		
		assertEquals(service.findAll().size(),2);
	}

}
