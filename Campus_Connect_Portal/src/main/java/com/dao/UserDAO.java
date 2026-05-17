package com.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class UserDAO {

    JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public boolean validateUser(String email, String password) {

        String sql ="select count(*) from users where email=? and password=?";

        Integer count = jdbcTemplate.queryForObject(sql,Integer.class,email,password);

        return count > 0;
    }
    public int registerUser(String email,
            String password) {

    	String sql ="insert into users(email,password) values(?,?)";

    	return jdbcTemplate.update(sql,email,password);
    	}
	}