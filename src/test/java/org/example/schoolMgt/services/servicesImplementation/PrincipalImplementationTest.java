package org.example.schoolMgt.services.servicesImplementation;

import org.example.schoolMgt.entities.Applicant;
import org.example.schoolMgt.entities.Principal;
import org.example.schoolMgt.entities.Student;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

// This is a test of the PrincipalServiceimplementation

//@ExtendWith()
public class PrincipalImplementationTest {



//    ++++++++++++++++++++++++++++++++++++++
// Test to see the principal should admit student via admitApplicant method
    @Test
    public void principalShouldAdmitStudent() {
        Applicant applicant = new Applicant();
        applicant.setAge(15);
        applicant.setName("Joy Favour");
        Principal principal = new Principal();
        principal.setName("Principal Mark");
        PrincipalImplementation principalImplementation = new PrincipalImplementation();
        String expected = "Principal Mark can admit Joy Favour";
        String actual = principalImplementation.admitApplicant(applicant, principal);
        assertEquals(expected, actual);

    }


// Test to see the principal should expel student via expelStudent method
    @Test
    public void principalShouldExpelStudent() {
        Principal principal = new Principal();
        Student student = new Student();
        student.setBreakingTheLaw(true);
        principal.setName("Principal Mark");
        student.setName("Motunde");
        PrincipalImplementation principalImplementation = new PrincipalImplementation();
        String expected = "Principal Mark should expel Motunde for breaking the law.";
        String actual = principalImplementation.expelStudent(principal, student);
        assertEquals(expected, actual);
    }


}