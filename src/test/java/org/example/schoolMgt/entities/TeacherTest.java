package org.example.schoolMgt.entities;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TeacherTest {

    @Test
    public void setTeacherName () {
        Teacher teacher = new Teacher();
        teacher.setName("Mrs Funke");

        assertEquals("Mrs Funke", teacher.getName());
    }

}