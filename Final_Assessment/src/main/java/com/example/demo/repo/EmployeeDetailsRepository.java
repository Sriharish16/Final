package com.example.demo.repo;

import java.time.LocalDate;


import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.EmployeeDetails;

@Repository
public interface EmployeeDetailsRepository extends JpaRepository<EmployeeDetails, Integer> {

	
	@Query(value="update EmployeeDetails set empName=:updatedName where empId=:srchId")
	@Modifying
	@Transactional
	int modifyName(@Param("srchId") int driverId,@Param("updatedName") String updatedName);
	
	
	@Query(value="update EmployeeDetails set empDesignationId=:updateddesig where empId=:srchId")
	@Modifying
	@Transactional
	int modifyDesignationId(@Param("srchId") int driverId,@Param("updateddesig") int updateddesig);
	
	
	@Query(value="update EmployeeDetails set empDoj=:updatedDob where empId=:srchId")
	@Modifying
	@Transactional
	int modifyDateOfBirth(@Param("srchId") int driverId,@Param("updatedDob") LocalDate date);

	
//	@Query(value="select * from sri_employee_details where emp_designation_id=:designationid", nativeQuery = true)
//	public List<EmployeeDetails> findByDesignationId(@Param("designationid")int id);
//	
//	
//	@Query(value="select * from sri_employee_details where emp_name=:empname", nativeQuery = true)
//	public List<EmployeeDetails> findByEmpName(@Param("empname")String name);
//	
//	
//	@Query(value="select * from sri_employee_details where emp_id=:empid", nativeQuery = true)
//	public EmployeeDetails findByEmpId(@Param("empid")int id);
//
}

