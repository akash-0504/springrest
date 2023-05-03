package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.entity.Course;

public interface CourseDao extends CrudRepository<Course, Long> {

}
 