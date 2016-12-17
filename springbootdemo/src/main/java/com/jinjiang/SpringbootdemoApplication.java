package com.jinjiang;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jinjiang.config.MybatisConfig;
import com.jinjiang.mapper.IEmployeeMapper;

@SpringBootApplication
@RestController
public class SpringbootdemoApplication {
	@Autowired
	private IEmployeeMapper employeeMapper;

	@RequestMapping("/h")
	public String sayHello() {
		return employeeMapper.findNameByempNo("1");
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootdemoApplication.class, args);
	}
}
