package com.example.DemoProject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.DemoProject.model.StudentDto;

@Repository
public interface StudentDao extends JpaRepository<StudentDto, Integer>{
    
	public StudentDto findByName(String studentName);
	
	public StudentDto findByNameAndAddress(String name, String address);
	
	
}
