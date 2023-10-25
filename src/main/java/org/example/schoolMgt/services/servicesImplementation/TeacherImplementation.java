package org.example.schoolMgt.services.servicesImplementation;

import org.example.schoolMgt.entities.Course;
import org.example.schoolMgt.entities.Student;
import org.example.schoolMgt.entities.Teacher;
import org.example.schoolMgt.enums.CourseType;
import org.example.schoolMgt.enums.StudentType;
import org.example.schoolMgt.enums.TeacherType;
import org.example.schoolMgt.services.TeacherServices;


public class TeacherImplementation implements TeacherServices {

    @Override
    public String teachCourses(Teacher teacher, Course course) {
       if (teacher.getTeacherType() == TeacherType.SCIENCE_TEACHER) {
           if (course.getCourseType() == CourseType.SCIENCE_COURSE) {
               Course.scienceCourseList.add(course);
               return ("The Sciences Teacher, " + teacher.getName() + " teaches the science courses: " + Course.scienceCourseList);
           }

       } else if (teacher.getTeacherType() == TeacherType.ART_TEACHER) {
           if (course.getCourseType() == CourseType.ART_COURSE) {
               Course.artCourseList.add(course);

           }

       }   return ("The Arts Teacher, " + teacher.getName() + " teaches the art courses: " + Course.artCourseList);

    }

    @Override
    public String gradeStudents(Teacher teacher, Student student) {
        if (teacher.getTeacherType() == TeacherType.SCIENCE_TEACHER) {
            if (student.getStudentType() == StudentType.SCIENCE_STUDENT) {
                Student.scienceStudentList.add(student);
                return ("The Sciences Teacher, " + teacher.getName() + " teaches the students: " + Student.scienceStudentList);
            }

        } else if (teacher.getTeacherType() == TeacherType.ART_TEACHER) {
            if (student.getStudentType() == StudentType.ART_STUDENT) {
                Student.artStudentList.add(student);
            }

        }   return ("The Arts Teacher, " + teacher.getName() + " teaches the students: " + Student.artStudentList);
    }
}

