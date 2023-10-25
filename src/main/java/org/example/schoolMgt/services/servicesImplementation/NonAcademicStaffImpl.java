package org.example.schoolMgt.services.servicesImplementation;

import org.example.schoolMgt.entities.NonAcademicStaff;
import org.example.schoolMgt.enums.Classes;
import org.example.schoolMgt.services.NonAcademicStaffServices;

public class NonAcademicStaffImpl implements NonAcademicStaffServices {

    @Override
    public Classes cleanClasses(NonAcademicStaff janitor) {

        Classes classes = null;
        if (janitor.getSchedule().equalsIgnoreCase("4pm - 6pm")) {
            classes = Classes.SS1;
            System.out.println("The janitor, " + janitor.getName() + " would clean " + classes);
        } else if (janitor.getSchedule().equalsIgnoreCase("6am - 7am")) {
            classes = Classes.SS2;
            System.out.println("The janitor, " + janitor.getName() + " would clean " + classes);
        } else if (janitor.getSchedule().equalsIgnoreCase("6pm - 7pm")) {
            classes = Classes.SS3;
            System.out.println("The janitor, " + janitor.getName() + " would clean " + classes);
        }

        return classes;
    }

}
