package org.example.schoolMgt.entities;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PrincipalTest {

    @Test
    public void setPrincipalSpecialisation () {
        Principal principal = new Principal();
        principal.setName("Mrs. Kehinde");
        principal.setSpecialization("Admission and Expulsion");
        assertEquals("Admission and Expulsion", principal.getSpecialization());
    }

}