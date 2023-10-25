package org.example.schoolMgt.entities;

import org.example.schoolMgt.enums.CourseType;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Course{

    private String courseName;
    private String timePeriod;
    private CourseType courseType;
    public static List<Course> scienceCourseList = new ArrayList<>();
    public static List<Course> artCourseList = new ArrayList<>();

    public Course () {

    }

    public Course(String courseName, String timePeriod, CourseType courseType) {
        this.courseName = courseName;
        this.timePeriod = timePeriod;
        this.courseType = courseType;
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

    public CourseType getCourseType() {
        return courseType;
    }

    public void setCourseType(CourseType courseType) {
        this.courseType = courseType;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", timePeriod='" + timePeriod + '\'' +
                ", courseType=" + courseType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(courseName, course.courseName) && Objects.equals(timePeriod, course.timePeriod) && courseType == course.courseType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseName, timePeriod, courseType);
    }
}
