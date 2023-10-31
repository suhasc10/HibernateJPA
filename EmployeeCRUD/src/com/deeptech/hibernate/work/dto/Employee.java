package com.deeptech.hibernate.work.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="employee")
public class Employee {
    @Id
    @Column(name = "e_empid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empId;
    @Column(name = "e_empname")
    private String empName;
    @Column(name = "e_email")
    private String email;
    @Column(name = "e_mobile")
    private String mobile;
    @Column(name = "e_age")
    private int age;
    @Column(name = "e_salary")
    private double salary;
    @Column(name = "e_state")
    private String state;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}

