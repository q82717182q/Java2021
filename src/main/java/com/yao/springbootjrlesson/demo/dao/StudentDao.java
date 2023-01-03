package com.yao.springbootjrlesson.demo.dao;


import com.yao.springbootjrlesson.demo.model.Student;

public interface StudentDao {

    Integer insert(Student student);

    void update(Student student);

    void deleteById(Integer id);

    Student getById(Integer id);
}
