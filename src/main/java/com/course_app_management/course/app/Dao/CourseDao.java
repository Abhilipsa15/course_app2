package com.course_app_management.course.app.Dao;

import com.course_app_management.course.app.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<Course, Long> {

}
