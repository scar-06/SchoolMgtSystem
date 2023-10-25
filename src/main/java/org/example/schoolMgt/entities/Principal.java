package org.example.schoolMgt.entities;

import java.math.BigDecimal;
import java.util.Objects;

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

    @Override
    public String toString() {
        return "Principal{" +
                "specialization='" + specialization + '\'' +
                ", schedule='" + schedule + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Principal principal = (Principal) o;
        return Objects.equals(specialization, principal.specialization) && Objects.equals(schedule, principal.schedule) && Objects.equals(salary, principal.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), specialization, schedule, salary);
    }

}
