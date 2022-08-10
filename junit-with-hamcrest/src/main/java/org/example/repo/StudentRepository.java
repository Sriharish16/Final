package org.example.repo;

import java.util.List;

import org.example.service.Student;

public interface StudentRepository {
	
	public Student add(Student entity);
	public List<Student>findAll();
public Student findById(int id);
}
