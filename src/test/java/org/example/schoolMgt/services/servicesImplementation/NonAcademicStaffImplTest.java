package org.example.schoolMgt.services.servicesImplementation;

import org.example.schoolMgt.entities.NonAcademicStaff;
import org.example.schoolMgt.enums.Classes;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NonAcademicStaffImplTest {

    @Test
    public void janitorShouldCleanSS2 () {
        NonAcademicStaff janitor = new NonAcademicStaff();
        NonAcademicStaffImpl nonAcademicStaff = new NonAcademicStaffImpl();
        janitor.setName("John Jones");
        janitor.setSchedule("6am - 7am");
        Classes expected = Classes.SS2;
        Classes actual = nonAcademicStaff.cleanClasses(janitor);
        assertEquals(expected, actual);
    }

}