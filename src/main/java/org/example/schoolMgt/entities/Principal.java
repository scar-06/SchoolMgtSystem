package org.example.schoolMgt.entities;

import java.math.BigDecimal;

public class Principal extends User{
    private String specialization;
    private String schedule;
    private BigDecimal salary;

    public Principal(String specialization, String schedule, String grade, BigDecimal salary) {
        this.specialization = specialization;
        this.schedule = schedule;
        this.salary = salary;
    }

    public Principal() {

    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

}
