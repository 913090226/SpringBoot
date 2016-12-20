package com.neo.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4395260371928911045L;
	
	@Id
	@GeneratedValue
	private Integer empNo;
	
	@Column
	private String name;
	
	@Column
	private Date hireDay;
	
	@Column
	private Double salary;
	
	@Column
	private Integer deptNo;

	public Employee() {
		super();
	}

	public Employee(Integer empNo, String name, Date hireDay, Double salary, Integer deptNo) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.hireDay = hireDay;
		this.salary = salary;
		this.deptNo = deptNo;
	}

	public Integer getEmpNo() {
		return empNo;
	}

	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getHireDay() {
		return hireDay;
	}

	public void setHireDay(Date hireDay) {
		this.hireDay = hireDay;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Integer getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
