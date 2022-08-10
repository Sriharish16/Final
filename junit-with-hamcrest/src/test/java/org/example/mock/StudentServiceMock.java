package org.example.mock;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.example.repo.StudentRepository;
import org.example.service.Student;

public class StudentServiceMock implements StudentRepository {

	int addCount=0;
	Student lastAdded=null;
	
	@Override
	public Student add(Student entity) {
		addCount++;
		lastAdded= entity;

		return lastAdded;
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
public void	verify(Student entity, int count) {
	
	assertEquals(addCount, count);
	assertEquals(lastAdded, entity);
	
}

@Override
public Student findById(int id) {
	// TODO Auto-generated method stub
	return null;
}

}
