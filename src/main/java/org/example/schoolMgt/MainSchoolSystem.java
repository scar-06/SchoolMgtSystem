package org.example.schoolMgt;

import org.example.schoolMgt.entities.*;
import org.example.schoolMgt.services.servicesImplementation.PrincipalImplementation;
import org.example.schoolMgt.services.servicesImplementation.TeacherImplementation;

import java.util.Arrays;

public class MainSchoolSystem {

    public static void main(String[] args) {
//        Initialising Instances from entities
        Principal principal = new Principal();
        Applicant applicant = new Applicant();
        Student student = new Student();
        Teacher teacher = new Teacher();
        Course course = new Course();
        Course course1 = new Course();


//        Inputting Fields and Methods of entities
        //    principal
        principal.setName("Principal Deca");
        principal.setSpecialization("Admission and Expulsion");

        // applicant
        applicant.setName("Olumide Olatunde");
        applicant.setAge(19);
        int applicantAge = applicant.getAge();

        // student
        student.setName("Ayodeji Mobolaji");
        student.setBreakingTheLaw(true);

        // teacher
        teacher.setName("Mr. Michael");


        // course
        course.setCourseName("Integrated Science");
        course.setTimePeriod("10am - 11:30am");
        course1.setCourseName("Physics");
        course1.setTimePeriod("1:30pm - 2:30pm");

        Course.courseList.add(course); // would occur twice for teachCourse TeacherImplementation printed here on Main (cos same statement is there as well)
        Course.courseList.add(course1);
        System.out.println("The Course LIst has the following " + Course.courseList);






        System.out.println("The applicant's name is " + applicant.getName() + " and the applicant is " + applicantAge + " years old");

//      Utilising functions/routines from "services"

//        Utilising the principal's routines

//            Principal expels Students for Breaking The Law (INTERFACE IMPLEMENTATION)
        PrincipalImplementation principalExpels = new PrincipalImplementation();
        String wouldApplicantBeExpelled = principalExpels.expelStudent(principal, student);
        System.out.println(wouldApplicantBeExpelled);

//              Principal admits Applicants (INTERFACE IMPLEMENTATION)
        PrincipalImplementation principalAdmits = new PrincipalImplementation();
        String wouldApplicantBeAdmitted = principalAdmits.admitApplicant(applicant,principal);
        System.out.println(wouldApplicantBeAdmitted);

//        Utilising the teacher's routines
//              Teacher teaches courses (INTERFACE IMPLEMENTATION)
        TeacherImplementation teacherTeaches = new TeacherImplementation();
        String teacherCourseList = teacherTeaches.teachCourses(teacher, course);
        System.out.println(teacherCourseList);


    }
}
