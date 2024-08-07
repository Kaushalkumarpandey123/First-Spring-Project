package com.example.DemoProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.DemoProject.model.StudentDto;
import com.example.DemoProject.service.StudentService;

@RestController()
@RequestMapping("/student")
public class StudentController {
    
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/home")
	public String home() {
		return "Home Screen.";
	}
	
	@GetMapping("/getStudent")
	@ResponseBody
	public List<StudentDto> getStudentDetails() {
		return studentService.getStudentDetails();
	}
	
	@PostMapping("/setStudent")
	public String setStudentDetails(@RequestBody StudentDto studentDto) {
		studentService.saveStudentDetails(studentDto);
		return "Success";
	}
	
	@GetMapping("/deleteAllStudents")
	public String deleteAllStudentDetails() {
		studentService.deleteAllStudents();
		return "Details deleted successfully.";
	}
	
	@PostMapping("/getByID")
	public StudentDto getStudentByID(@RequestBody int ID) {
		return studentService.getStuByID(ID).orElse(new StudentDto());
	}
	
	@PostMapping("/getByName")
	public StudentDto getStudentByNmae(@RequestBody String name) {
		return studentService.getByName(name);
	}
}
