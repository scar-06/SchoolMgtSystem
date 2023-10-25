package org.example.schoolMgt.entities;

import org.example.schoolMgt.enums.TeacherType;

public class Teacher extends User{
    private TeacherType teacherType;

    public Teacher(TeacherType teacherType) {
        this.teacherType = teacherType;
    }

    public Teacher() {
    }

    public TeacherType getTeacherType() {
        return teacherType;
    }

    public void setTeacherType(TeacherType teacherType) {
        this.teacherType = teacherType;
    }
}
