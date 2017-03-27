package edu.ouhk.comps380f.controller;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

@Repository
public class StudentTemplate {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public void insert(String username, String password) {
        String sql = "insert into logininfo (username, password) values (?, ?)";
        jdbcTemplate.update(sql, new Object[]{username, password});
        System.out.println("Successful" + username + ", " + password);
    }
}
