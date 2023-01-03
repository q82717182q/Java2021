package com.yao.springbootjrlesson.demo.service;

import com.yao.springbootjrlesson.demo.model.Student;

public interface StudentService {

    Integer insert(Student student);

    void update(Student student);

    void deleteById(Integer id);

    Student getById(Integer id);
}
