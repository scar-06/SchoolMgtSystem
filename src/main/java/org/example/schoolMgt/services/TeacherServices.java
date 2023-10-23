package org.example.schoolMgt.services;

import org.example.schoolMgt.entities.Course;
import org.example.schoolMgt.entities.Student;
import org.example.schoolMgt.entities.Teacher;

import java.util.List;
import java.util.ListResourceBundle;

public interface TeacherServices {
    String teachCourses(Teacher teacher, Course course);


    String gradeStudents(Teacher teacher, Student student);
}
