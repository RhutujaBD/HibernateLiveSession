package com.example.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class EmployeeId implements Serializable{

	@Column(name="EMPLOYEE_ID")
	private Integer EMPLOYEE_ID;

	@Column(name="DEPARMENT_ID")
	private Integer DEPARMENT_ID;
	
	public EmployeeId() {
		super();
	}
	public EmployeeId(Integer EMPLOYEE_ID, Integer DEPARMENT_ID) {
		super();
		this.EMPLOYEE_ID = EMPLOYEE_ID;
		this.DEPARMENT_ID = DEPARMENT_ID;
	}
	
	public Integer getEmpId() {
		return EMPLOYEE_ID;
	}
	public void setEmpId(Integer EMPLOYEE_ID) {
		this.EMPLOYEE_ID = EMPLOYEE_ID;
	}
	public Integer getDeptId() {
		return DEPARMENT_ID;
	}
	public void setDeptId(Integer DEPARMENT_ID) {
		this.DEPARMENT_ID = DEPARMENT_ID;
	}
	@Override
	public String toString() {
		return "EmpId [empId=" + EMPLOYEE_ID + ", deptId=" + DEPARMENT_ID + "]";
	}
	
}