package com.delaguila.courseapi.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CourseService {

    //Logger logger = LoggerFactory.getLogger(TopicService.class);

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses(String id) {
        return (List<Course>) this.courseRepository.findAll();
    }

    public Course getCourse(String id) {
        return this.courseRepository.findById(id).get();
    }

    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    public void updateCourse(Course course) {
        courseRepository.save(course);
    }

    public void deleteCourse(String id) {
        courseRepository.deleteById(id);
    }

}