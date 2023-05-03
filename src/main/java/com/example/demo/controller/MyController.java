package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Course;
import com.example.demo.services.CourseService;

@RestController
public class MyController {
	
    @Autowired
	private CourseService courseService;
	
    // Courses Add
 	@PostMapping("/courses")
 	public Course addCourse(@RequestBody Course course) {
 		return this.courseService.addCourse(course);
 		}
	
	//Get the courses
	@GetMapping("/courses")
	public List<Course> getCourses()
	{
		return this.courseService.getCourses();
	}
	
	//single courses get
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable("courseId") long courseId)
	{
		return this.courseService.getCourse(courseId);	
	}
	
	//Update course using put request
	@PutMapping("/courses")
	public Course updateCourse(@RequestBody Course course) {
		return this.courseService.updateCourse(course);
    }
	
	// delete the course
	@DeleteMapping("/deleteCourses/{courseId}")
	public Course deleteCourse(@PathVariable("courseId") long courseId) 
	{
		try {
			Course course = courseService.deleteCourse(courseId);
			return course;
		    } catch (Exception e) {
    	   return null;   
       }	
	}
}
