package com.tcs.emp.mgmt.employeemanagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {

	// define fields
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="department_name")
	private String departmentname;
	
	// define constructors
	
		public Employee() {
			
		}

		public Employee(String firstName, String lastName, String departmentname) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.departmentname = departmentname;
		}

		//getters and setters
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getDepartmentname() {
			return departmentname;
		}

		public void setDepartmentname(String departmentname) {
			this.departmentname = departmentname;
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", departmentname="
					+ departmentname + "]";
		}
		
		
		
		
}
