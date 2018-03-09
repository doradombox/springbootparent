package org.mysql.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {
    
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void createUser(String name, Integer age) {
        // TODO Auto-generated method stub
        jdbcTemplate.update("insert into USERS(NAME, AGE) values(?, ?)", name, age);
    }

    @Override
    public void deleteByName(String name) {
        // TODO Auto-generated method stub
        jdbcTemplate.update("delete from USERS where NAME = ?", name);
    }

    @Override
    public Integer getAllUsers() {
        // TODO Auto-generated method stub
        return jdbcTemplate.queryForObject("select count(1) from USERS", Integer.class);
    }

    @Override
    public void deleteAllUsers() {
        // TODO Auto-generated method stub
        jdbcTemplate.update("delete from USERS");
    }

}
