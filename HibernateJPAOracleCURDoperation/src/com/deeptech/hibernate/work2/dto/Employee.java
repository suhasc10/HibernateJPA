package com.deeptech.hibernate.work2.dto;

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
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int empid;
    @Column(name = "e_empname")
    private String empname;
    @Column(name = "e_designation")
    private String designation;
    @Column(name = "e_salary")
    private double salary;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
 

}