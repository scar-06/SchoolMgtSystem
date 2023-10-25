package org.example.schoolMgt;

import org.example.schoolMgt.entities.*;
import org.example.schoolMgt.enums.Gender;
import org.example.schoolMgt.enums.Role;
import org.example.schoolMgt.services.servicesImplementation.NonAcademicStaffImpl;
import org.example.schoolMgt.services.servicesImplementation.PrincipalImplementation;
import org.example.schoolMgt.services.servicesImplementation.TeacherImplementation;

import java.math.BigDecimal;
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
        NonAcademicStaff nonAcad = new NonAcademicStaff();


//        Inputting Fields and Methods of entities
        //    principal
        principal.setName("Principal Deca");
        principal.setSpecialization("Admission and Expulsion");
        principal.setGender(Gender.MALE);
        principal.setSalary(BigDecimal.valueOf(550000));

        // applicant
        applicant.setName("Olumide Olatunde");
        applicant.setAge(19);
        int applicantAge = applicant.getAge();

        // student
        student.setName("Ayodeji Mobolaji");
        student.setBreakingTheLaw(false);

        // teacher
        teacher.setName("Mr. Michael");

        // course
        course.setCourseName("Integrated Science");
        course.setTimePeriod("10am - 11:30am");
        course1.setCourseName("Creative Arts");
        course1.setTimePeriod("1:30pm - 2:30pm");
        Course.scienceCourseList.add(course);
        Course.artCourseList.add(course1);
        System.out.println("The Science Course LIst has the following " + Course.scienceCourseList);
        System.out.println("The Science Course LIst has the following " + Course.artCourseList);

        // non-academic staff
        nonAcad.setName("Funke Yemi");
        nonAcad.setRole(Role.JANITOR);
        nonAcad.setSchedule("4PM - 6PM");



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

//        Utilising the non-academic staff's routines
        NonAcademicStaffImpl nonAcademicStaff = new NonAcademicStaffImpl();
        nonAcademicStaff.cleanClasses(nonAcad);





    }
}
