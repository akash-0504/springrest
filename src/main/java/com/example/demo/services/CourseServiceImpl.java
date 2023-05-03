package com.example.demo.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dao.CourseDao;
import com.example.demo.entity.Course;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseDao courseDao;

	@Override
	public List<Course> getCourses() {
		return (List<Course>) courseDao.findAll();

	}

	@Override
	public Course getCourse(long courseId) {
		return courseDao.findById(courseId).get();
	}

	@Override
	public Course addCourse(Course course) {
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		courseDao.save(course);
		return course;
	}

	@Override
	public Course deleteCourse(long courseId) {
		Course course = courseDao.findById(courseId).get();
		courseDao.deleteById(courseId);
		return course;
	}

}
