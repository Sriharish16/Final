package org.example.mockito.module1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.example.repo.StudentRepository;
import org.example.service.Student;
import org.example.service.StudentService;

@ExtendWith(MockitoExtension.class)
public class StudentServiceTest {
	
	@Mock
	StudentRepository repo;
	
	@Mock
	public StudentService service1;
	
	@InjectMocks
	StudentService service;
	
	
	@DisplayName("Test Find All method with Mockito Stub")
	@Test
	void testFindAll() {
		StudentRepository repo = mock(StudentRepository.class);
		StudentService service= new  StudentService(repo);
		
		//Stubbing
		Student inv1 = new Student(901, "tom");
	    Student inv2=new Student(902, "jerry");

	    List<Student> list = new ArrayList<>();
	    
	    list.add(inv2);
	    list.add(inv1);

		when(repo.findAll()).thenReturn(list);
		assertEquals(service.findStudentSize(), 2);
		
	
	}
		

	
	@Test
	@DisplayName("Test find all method with mockito stub with annotation")

	void testFindAllWithMock() {
		
		//Stubbing
		Student inv1 = new Student(901, "tom");
	    Student inv2=new Student(902, "jerry");

	    List<Student> list = new ArrayList<>();
	    
	    list.add(inv2);
	    list.add(inv1);

		when(repo.findAll()).thenReturn(list);
		assertEquals(service.findStudentSize(), 2);
		
	}

	@Test
	@DisplayName("Test addWithCondition Method of the service it should add elements only"+"roll number is greater than 2000, else it should return a null value")
	
	void testAddWithCondition() {
//		StudentRepository repo = Mockito.mock(StudentRepository.class);
//		StudentService service= Mockito.mock(StudentService.class);
		//Stubbing
	    Student inv2=new Student(20, "jerry");
	    
		assertNotNull(service.addWithCondition(inv2));

	}

	@Test
	@DisplayName("Test with Verify add condition mehtod")
	void testVerifyAddWithCondition() {
	    Student inv2=new Student(20, "jerry");
	    service1.addWithCondition(inv2);
		verify(service1,times(1)).addWithCondition(inv2);

	}

	@Test
	@DisplayName("FindAllTest")
	void testFindByIdCondition()
	{
		Student stud=new Student(2020,"Ramesh");
		Student stud2=new Student(2021,"Rajesh");
		
		when(service.findById(2020)).thenReturn(stud);
		Student expected=service.findById(2020);
		
		assertEquals(expected, stud);
	}
	
//	@Test
//	@DisplayName(value="Test the value is not found should return the Elements not f")
//	void shouldThrowExceptionWhenElementNotFound() {
//		
//		Student stud= new Student(2020,"Ramesh");
//		when(repo.findById(anyInt())).thenThrow(RuntimeException.class);
//		assertThrows(RuntimeException.class,()->service1.findById(5603));
//	}
	
	
}
