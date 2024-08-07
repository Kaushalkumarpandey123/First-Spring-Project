package com.example.DemoProject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DemoProject.dao.StudentDao;
import com.example.DemoProject.model.StudentDto;

@Service
public class StudentService {

	@Autowired
	private StudentDao studentDao;
	
	public List<StudentDto> getStudentDetails() {
		return studentDao.findAll();
	}

	public void saveStudentDetails(StudentDto studentDto) {
		studentDao.save(studentDto);	
	}

	public void deleteAllStudents() {
		studentDao.deleteAll();
	}

	public Optional<StudentDto> getStuByID(int iD) {
		return studentDao.findById(iD);
	}
    
	public StudentDto getByName(String name) {
		return studentDao.findByName(name);
	}
	
	
	
}
