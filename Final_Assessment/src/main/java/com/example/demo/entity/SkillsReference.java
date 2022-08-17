package com.example.demo.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level=AccessLevel.PRIVATE)
@Entity
@Table(name="sri_skills_Reference")
public class SkillsReference {
	
	@Id
	@Column(name="skill_id")
	@GeneratedValue(strategy= GenerationType.AUTO)
	int skillId;
	
	@Column(name="skill_type")
	String skillType;
	
	@Column(name="skill_name",unique= true)
	String skillName;
	
	@Column(name="created_Date")
	@DateTimeFormat(iso=ISO.DATE)
	LocalDate empDoj;

	@Column(name="created_by")
	String createdBy;
	
	@Column(name="created_time")
	@DateTimeFormat(iso=ISO.TIME)
	LocalTime createdTime;
	

}
