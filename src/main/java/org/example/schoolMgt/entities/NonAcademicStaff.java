package org.example.schoolMgt.entities;

import org.example.schoolMgt.enums.Role;

import java.math.BigDecimal;
import java.util.Objects;

public class NonAcademicStaff extends User{
   private Role role;
   private String schedule;
   private BigDecimal salary;

   public NonAcademicStaff(Role role, String schedule, BigDecimal salary) {
      this.role = role;
      this.schedule = schedule;
      this.salary = salary;
   }

   public NonAcademicStaff() {
   }

   public Role getRole() {
      return role;
   }

   public void setRole(Role role) {
      this.role = role;
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
      return "NonAcademicStaff{" +
              "role=" + role +
              ", schedule='" + schedule + '\'' +
              ", salary=" + salary +
              '}';
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      if (!super.equals(o)) return false;
      NonAcademicStaff that = (NonAcademicStaff) o;
      return role == that.role && Objects.equals(schedule, that.schedule) && Objects.equals(salary, that.salary);
   }

   @Override
   public int hashCode() {
      return Objects.hash(super.hashCode(), role, schedule, salary);
   }
}

