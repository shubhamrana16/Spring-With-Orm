package com.spring.orm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emp_details")
public class Employee {
	
	@Id
	
	@Column(name="emp_id")
	private String id;
	
	@Column(name="emp_name")
	private String name;
	
	@Column(name="emp_address")
	private String address;
	
	@Column(name="emp_dept")
	private String department;
	
	 
	
	@Column(name="emp_salary")
	private int salary;



	public Employee(String id, String name, String address, String department, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.department = department;
		this.salary = salary;
	}



	public Employee() {
		 
		 
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
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



	public String getDepartment() {
		return department;
	}



	public void setDepartment(String department) {
		this.department = department;
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", department=" + department
//				+ ", salary=" + salary + "]";
//	}


	
	
}
