package com.jinjiang.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.jinjiang.model.Employee;

@Mapper
public interface IEmployeeMapper {
	public List<Employee> findAll();
	
	public String findNameByempNo(@Param("empNo") String empNo);
}
