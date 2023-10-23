package org.example.schoolMgt.services;

import org.example.schoolMgt.entities.Applicant;
import org.example.schoolMgt.entities.Principal;
import org.example.schoolMgt.entities.Student;

public interface PrincipalServices {
    String expelStudent(Principal principal, Student student);



    String admitApplicant(Applicant applicant, Principal principal);
}
