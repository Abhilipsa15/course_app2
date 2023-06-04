package com.course_app_management.course.app.services;

import com.course_app_management.course.app.entities.Course;

import java.util.List;

public interface CourseService
{
    public List<Course> getCourses();

  Course  getCourse(long id);

  Course addcourse(Course course);
  Course updatecourse(Course course);
  void deleteCourse(long courseID);

    Course addCourse(String course);
}
