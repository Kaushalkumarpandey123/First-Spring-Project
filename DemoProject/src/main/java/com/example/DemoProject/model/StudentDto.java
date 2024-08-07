package com.example.DemoProject.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "STUDENT")
public class StudentDto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "StudentId")
	private int id;
	
	@Column(name = "StudentName")
	private String name;
	
	@Column(name = "StudentAddress")
	private String address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "StudentDto [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	public StudentDto(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public StudentDto() {
	}

	
}
