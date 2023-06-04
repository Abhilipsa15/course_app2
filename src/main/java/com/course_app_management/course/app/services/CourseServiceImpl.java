package com.course_app_management.course.app.services;

import com.course_app_management.course.app.Dao.CourseDao;
import com.course_app_management.course.app.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class CourseServiceImpl implements CourseService{
    @Autowired
    
  private CourseDao courseDao;

    public CourseServiceImpl(CourseDao courseDao) {
        this.courseDao = courseDao;
    }
    @Override
    public List<Course> getCourses() {
        return courseDao.findAll();
    }

    @Override
    public Course getCourse(long id) {
        Optional<Course>courseOptionalObject = courseDao.findById(id);
        if(courseOptionalObject.isPresent())
            return courseOptionalObject.get();
        else 
            return null;
    }

    @Override
    public Course addcourse(Course course) {
        courseDao.save(course);
        return course;
    }

    @Override
    public Course updatecourse(Course course) {
        courseDao.save(course);
        return course;
    }

    @Override
    public void deleteCourse(long courseID) {
        Course course=courseDao.findById(courseID).get();
        courseDao.delete(course);

    }

    @Override
    public Course addCourse(String course) {
        return null;
    }
}
