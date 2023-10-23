package org.example.schoolMgt.entities;

import java.util.ArrayList;
import java.util.List;

public class Student extends User{
    private String club;
    boolean isBreakingTheLaw;

    public static List<Student> studentList = new ArrayList<>();


    public boolean isBreaking() {
        boolean brakeLaw = false;
        if (isBreakingTheLaw) {

            System.out.println("The student " + getName() + " is expelled for breaking the law");
            brakeLaw = true;
            return brakeLaw;
        } else {
            brakeLaw = false;
            return brakeLaw;
        }

    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public boolean isBreakingTheLaw() {
        return isBreakingTheLaw;
    }

    public void setBreakingTheLaw(boolean breakingTheLaw) {
        isBreakingTheLaw = breakingTheLaw;

    }
}
