package org.example.schoolMgt.services.servicesImplementation;

import org.example.schoolMgt.entities.Course;
import org.example.schoolMgt.entities.Student;
import org.example.schoolMgt.entities.Teacher;
import org.example.schoolMgt.services.TeacherServices;

import java.util.ArrayList;
import java.util.List;

public class TeacherImplementation implements TeacherServices {

    @Override
    public String teachCourses(Teacher teacher, Course course) {
        Course.courseList.add(course);
        if (Course.courseList.size() == 1) {
            return (teacher.getName() + " teaches the course: " + course.getCourseName());
        }
        return (teacher.getName() + " teaches the following courses: " + Course.courseList);

    }

    @Override
    public String gradeStudents(Teacher teacher, Student student) {
        Student.studentList.add(student);
        if (Student.studentList.size() == 1) {
            return (teacher.getName() + " teaches the student: " + Student.studentList);
        }
        return (teacher.getName() + " teaches the following students: " + Student.studentList);
    }
}
