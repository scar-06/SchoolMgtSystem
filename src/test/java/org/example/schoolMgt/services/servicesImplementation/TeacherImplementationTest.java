package org.example.schoolMgt.services.servicesImplementation;

import org.example.schoolMgt.entities.Course;
import org.example.schoolMgt.entities.Student;
import org.example.schoolMgt.entities.Teacher;
import org.example.schoolMgt.enums.CourseType;
import org.example.schoolMgt.enums.Gender;
import org.example.schoolMgt.enums.StudentType;
import org.example.schoolMgt.enums.TeacherType;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TeacherImplementationTest {

    @Test
    public void TeacherTakesArtCourses (){
        Teacher teacher = new Teacher();
        Course course = new Course();
        teacher.setName("Mrs. Dolapo");
        teacher.setGender(Gender.FEMALE);
        teacher.setTeacherType(TeacherType.ART_TEACHER);
        course.setCourseName("Creative Arts");
        course.setCourseType(CourseType.ART_COURSE);
        TeacherImplementation teacherImplementation = new TeacherImplementation();

        String actual = teacherImplementation.teachCourses(teacher, course);
        String expected = "The Arts Teacher, Mrs. Dolapo teaches the art courses: " + Course.artCourseList;

        assertEquals(expected, actual);
    }

    @Test
    public void TeacherTakesScienceCourses (){
        Teacher teacher = new Teacher();
        Course course = new Course();
        teacher.setName("Mr. Taiwo");
        teacher.setGender(Gender.MALE);
        teacher.setTeacherType(TeacherType.SCIENCE_TEACHER);
        course.setCourseName("Physics");
        course.setCourseType(CourseType.SCIENCE_COURSE);
        TeacherImplementation teacherImplementation = new TeacherImplementation();

        String actual = teacherImplementation.teachCourses(teacher, course);
        String expected = "The Sciences Teacher, Mr. Taiwo teaches the science courses: " + Course.scienceCourseList;

        assertEquals(expected, actual);
    }

    @Test
    public void TeacherTakesArtStudents (){
        Teacher teacher = new Teacher();
        Student student = new Student();
        teacher.setName("Mrs. Dolapo");
        teacher.setGender(Gender.FEMALE);
        teacher.setTeacherType(TeacherType.ART_TEACHER);
        student.setName("Mariam Blessing");
        student.setStudentType(StudentType.ART_STUDENT);
        TeacherImplementation teacherImplementation = new TeacherImplementation();

        String actual = teacherImplementation.gradeStudents(teacher, student);
        String expected = "The Arts Teacher, Mrs. Dolapo teaches the students: " + Student.artStudentList;

        assertEquals(expected, actual);
    }


    @Test
    public void TeacherTakesScienceStudents (){
        Teacher teacher = new Teacher();
        Student student = new Student();
        teacher.setName("Mr. Taiwo");
        teacher.setGender(Gender.MALE);
        teacher.setTeacherType(TeacherType.SCIENCE_TEACHER);
        student.setName("Mariam Blessing");
        student.setStudentType(StudentType.SCIENCE_STUDENT);
        TeacherImplementation teacherImplementation = new TeacherImplementation();

        String actual = teacherImplementation.gradeStudents(teacher, student);
        String expected = "The Sciences Teacher, Mr. Taiwo teaches the students: " + Student.scienceStudentList;

        assertEquals(expected, actual);
    }



}