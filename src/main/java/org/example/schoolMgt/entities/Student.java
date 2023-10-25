package org.example.schoolMgt.entities;

import org.example.schoolMgt.enums.StudentType;

import java.util.ArrayList;
import java.util.List;

public class Student extends User{
    private StudentType studentType;
    private boolean isBreakingTheLaw;

    public static List<Student> artStudentList = new ArrayList<>();
    public static List<Student> scienceStudentList = new ArrayList<>();

    public Student(StudentType studentType, boolean isBreakingTheLaw) {
        this.studentType = studentType;
        this.isBreakingTheLaw = isBreakingTheLaw;
    }


    public Student() {
    }

    public boolean isBreaking() {
//        boolean brakeLaw = false;
        if (isBreakingTheLaw) {

            System.out.println("The student " + getName() + " is expelled for breaking the law");
//            brakeLaw = true;
            return isBreakingTheLaw;
        } else {
            isBreakingTheLaw = false;
            return isBreakingTheLaw;
        }

    }

    public StudentType getStudentType() {
        return studentType;
    }

    public void setStudentType(StudentType studentType) {
        this.studentType = studentType;
    }

    public boolean isBreakingTheLaw() {
        return isBreakingTheLaw;
    }

    public void setBreakingTheLaw(boolean breakingTheLaw) {
        isBreakingTheLaw = breakingTheLaw;

    }


}
