package org.example.schoolMgt.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Course{

    private String courseName;
    private String timePeriod;
    public static List<Course> courseList = new ArrayList<>();  // why should this be static??

    public Course () {

    }


    public Course(String courseName, String timePeriod) {
        this.courseName = courseName;
        this.timePeriod = timePeriod;
    }

    public String getTimePeriod() {
        return timePeriod;
    }

    public void setTimePeriod(String timePeriod) {
        this.timePeriod = timePeriod;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", timePeriod='" + timePeriod + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(courseName, course.courseName) && Objects.equals(timePeriod, course.timePeriod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseName, timePeriod);
    }
}
