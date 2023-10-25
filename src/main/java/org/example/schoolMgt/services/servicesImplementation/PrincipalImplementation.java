package org.example.schoolMgt.services.servicesImplementation;

import org.example.schoolMgt.entities.Applicant;
import org.example.schoolMgt.entities.Principal;
import org.example.schoolMgt.entities.Student;
import org.example.schoolMgt.services.PrincipalServices;

public class PrincipalImplementation implements PrincipalServices {
    @Override
    public String expelStudent(Principal principal, Student student) {
        String expel = (principal.getName() + " should expel " + student.getName() +" for breaking the law.");

        if (student.isBreaking()) {
            return expel;
        } else {
            return ("The student broke no rules.");
        }
    }


    @Override
    public String admitApplicant(Applicant applicant, Principal principal) {
        int minAge = 14;
        int maxAge = 18;

        String canAdmit = principal.getName() + " can admit " + applicant.getName();
        String canNotAdmit = principal.getName() + " CANNOT admit " + applicant.getName();


        if (applicant.getAge() >= minAge && applicant.getAge() <= maxAge) {
            Applicant.applicantList.add(applicant);
            return canAdmit;
        } else {
            return canNotAdmit;
        }




    }
}
