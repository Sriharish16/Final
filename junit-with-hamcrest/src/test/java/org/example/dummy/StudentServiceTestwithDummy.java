package org.example.dummy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.fake.StudentRepoFake;
import org.example.service.Student;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StudentServiceTestwithDummy {
	
	@Test
	@DisplayName("Test Add Method return inserted object back")
	void testAddMethod() {
		StudentRepoFake fake = new StudentRepoFake();
		DummyProfessorRepo dummy= new DummyProfessorRepo();
		StudentService service= new StudentService(fake,dummy);
		Student ram= new Student(101,"Ram");
		Student actual =service.add(ram);
		assertEquals(actual,ram);
	}

}
