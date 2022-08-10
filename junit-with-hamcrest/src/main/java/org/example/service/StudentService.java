package org.example.service;

import java.util.List;

import org.example.repo.StudentRepository;

public class StudentService {
	
	private StudentRepository repo;


	public Student add(Student entity) {
		return this.repo.add(entity);
	}
	
	public List<Student>findAll(){
		return this.repo.findAll();
		
	}
	public Student addWithCondition(Student entity) {
		
		Student added= null;
		if(entity.getRollNumber()<2000) {
			 this.repo.add(entity);
			added =entity;
				
			}
		return added;
	}
		
	
	
	public int findStudentSize() {
		return this.repo.findAll().size();
	}

	public StudentService(StudentRepository repo) {
		super();
		this.repo = repo;
	}
	
public Student findById(int i) {
		
		Student found=this.repo.findById(2020);
		
		return found;
		
	}
}
