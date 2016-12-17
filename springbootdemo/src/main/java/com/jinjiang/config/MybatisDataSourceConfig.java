package com.jinjiang.config;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@MapperScan("com.jinjiang.mapper")
public class MybatisDataSourceConfig {
	private static final Logger logger = LoggerFactory.getLogger(MybatisDataSourceConfig.class);

	@Autowired
	private JdbcConfig jdbcConfig;

	@Bean
	public DataSource createDataSource() throws SQLException {
		return DataSourceBuilder.create(Thread.currentThread().getContextClassLoader())
				.driverClassName(jdbcConfig.getDriverClass()).url(jdbcConfig.getUrl()).username(jdbcConfig.getUserName())
				.password(jdbcConfig.getPassword()).build();
	}

	@PropertySource(value = "application.properties")
	@Component
	static class JdbcConfig {
		/** * 数据库用户名 */
		//@Value("${spring.datasource.username}")
		private String userName = "root";
		/** * 驱动名称 */
		//@Value("${spring.datasource.driver-class-name}")
		private String driverClass = "com.mysql.jdbc.Driver";
		/** * 数据库连接url */
		//@Value("${spring.datasource.url}")
		private String url = "jdbc:mysql://127.0.0.1:3306/spring4_mybatis3?characterEncoding=UTF-8";
		/** * 数据库密码 */
		//@Value("${spring.datasource.password}")
		private String password = "Jj123456";

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getDriverClass() {
			return driverClass;
		}

		public void setDriverClass(String driverClass) {
			this.driverClass = driverClass;
		}

		public String getUrl() {
			return url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
	}
}
