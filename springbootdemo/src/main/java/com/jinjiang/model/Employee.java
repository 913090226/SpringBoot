package com.jinjiang.model;

import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer empNo;
	private String name;
	private Date hireday;
	private Double salary;
	private Integer deptNo;

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

	public Date getHireday() {
		return hireday;
	}

	public void setHireday(Date hireday) {
		this.hireday = hireday;
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

	public Employee() {
		super();
	}

	public Employee(Integer empNo, String name, Date hireday, Double salary, Integer deptNo) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.hireday = hireday;
		this.salary = salary;
		this.deptNo = deptNo;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", name=" + name + ", hireday=" + hireday + ", salary=" + salary
				+ ", deptNo=" + deptNo + "]";
	}

}
