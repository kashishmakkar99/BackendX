package com.bigmakk.databse.dao;

import com.bigmakk.databse.entity.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    private JdbcTemplate jdbcTemplate;

    public UserDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int saveUser(User user){

        String query="insert into users values(?,?,?,?,?,?)";
       int num= jdbcTemplate.update(query,
                user.getId(),
                user.getName(),
                user.getEmail(),
                user.getPassword(),
                user.getCity(),
                user.getSalary());

        return num;


    }
}
