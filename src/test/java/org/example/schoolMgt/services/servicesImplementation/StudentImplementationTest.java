package org.example.schoolMgt.services.servicesImplementation;

import org.example.schoolMgt.entities.Course;
import org.example.schoolMgt.entities.Student;
import org.example.schoolMgt.enums.CourseType;
import org.example.schoolMgt.enums.StudentType;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentImplementationTest {

    @Test
    public void studentTakesArtCourses (){
        Student student = new Student();
        Course course = new Course();
        student.setName("Jane Bondett");
        student.setStudentType(StudentType.ART_STUDENT);
        course.setCourseName("Creative Arts");
        course.setCourseType(CourseType.ART_COURSE);
        StudentImplementation studentImplementation = new StudentImplementation();
        String actual = studentImplementation.takeCourses(student, course);
        String expected = "The Art Student Jane Bondett takes the following art courses: " + Course.artCourseList;
        assertEquals(expected, actual);
    }


    @Test
    public void studentTakesScienceCourses (){
        Student student = new Student();
        Course course = new Course();
        student.setName("Mark Wilson");
        student.setStudentType(StudentType.SCIENCE_STUDENT);
        course.setCourseName("Physics");
        course.setCourseType(CourseType.SCIENCE_COURSE);
        StudentImplementation studentImplementation = new StudentImplementation();
        String actual = studentImplementation.takeCourses(student, course);
        String expected = "The Science Student Mark Wilson takes the following science courses: " + Course.scienceCourseList;
        assertEquals(expected, actual);
    }

}