package org.example.schoolMgt.entities;

import org.example.schoolMgt.enums.StudentType;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    public void setStudentType () {
        Student student = new Student();
        student.setStudentType(StudentType.SCIENCE_STUDENT);
        student.setName("Mark Davis");
        assertEquals(StudentType.SCIENCE_STUDENT, student.getStudentType());
    }

}