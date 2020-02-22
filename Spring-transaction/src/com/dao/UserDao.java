package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class UserDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void updateUser() {
		System.out.println("userBook执行了");
		jdbcTemplate.update("update user set `username` = '用户表被修改了~~'");
	}
}
