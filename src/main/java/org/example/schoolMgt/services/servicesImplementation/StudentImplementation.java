package org.example.schoolMgt.services.servicesImplementation;

import org.example.schoolMgt.entities.Course;
import org.example.schoolMgt.entities.Student;
import org.example.schoolMgt.enums.StudentType;
import org.example.schoolMgt.services.StudentServices;

public class StudentImplementation implements StudentServices {

    @Override
    public String takeCourses(Student student, Course course) {
        if (student.getStudentType() == StudentType.SCIENCE_STUDENT) {
            Course.scienceCourseList.add(course);
            return ("The Science Student " + student.getName() + " takes the following science courses: " + Course.scienceCourseList);
        } else {
            Course.artCourseList.add(course);
            return ("The Art Student " + student.getName() + " takes the following art courses: " + Course.artCourseList);
        }
    }


}
