package org.example.dummy;

import java.util.List;

import org.example.fake.StudentRepoFake;
import org.example.service.Student;

public class StudentService {
	
	private StudentRepoFake fake;
	private DummyProfessorRepo dummy;
	
	public StudentService(StudentRepoFake fake, DummyProfessorRepo dummy) {
		super();
		this.fake = fake;
		this.dummy = dummy;
	}

	public Student add(Student entity) {
		return this.fake.add(entity);
	}
	
	public List<Student>findAll(){
		return this.fake.findAll();
		
		
	}
	  

}
