package org.example.stub;

import java.util.Arrays;
import java.util.List;

import org.example.repo.StudentRepository;
import org.example.service.Student;

public class StudentRepositoryStub implements StudentRepository{

	@Override
	public Student add(Student entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return Arrays.asList(new Student(202,"Shiv"),new Student(203,"Kasi"));
	}

}
