package com.example.springboot_postgres;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void createTable(){
        String query = "CREATE TABLE student(id SERIAL PRIMARY KEY, name varchar(255) NOT NULL , city varchar(255))";
        int update = this.jdbcTemplate.update(query);
        System.out.println(update);
    }

    public void insertData(String name, String city){
        String query = "INSERT INTO student(name, city) VALUES (?,?)";
        int update = this.jdbcTemplate.update(query, name, city);
        System.out.println(update);
    }

    public void updateData(int id, String name, String city){
        String query = "UPDATE student SET name = ?, city = ? WHERE ID = ?;";
        int update = this.jdbcTemplate.update(query, name, city, id);
        System.out.println(update);
    }

    public void delData(int id){
        String query = "DELETE FROM student WHERE id = ?";
        int update = this.jdbcTemplate.update(query, id);
        System.out.println(update);
    }
}
