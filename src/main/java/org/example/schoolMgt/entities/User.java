package org.example.schoolMgt.entities;

import lombok.Data;
import org.example.schoolMgt.enums.Gender;

@Data
public abstract class User {
    private String name;
    private int age;
    private Gender gender;
    private String address;
    private Long phoneNumber;
    private String id;
    private String nextOfKin;
    private Long nextOfKinPhoneNumber;
    private String religion;

//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public Gender getGender() {
//        return gender;
//    }
//
//    public void setGender(Gender gender) {
//        this.gender = gender;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public Long getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public void setPhoneNumber(Long phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getNextOfKin() {
//        return nextOfKin;
//    }
//
//    public void setNextOfKin(String nextOfKin) {
//        this.nextOfKin = nextOfKin;
//    }
//
//    public Long getNextOfKinPhoneNumber() {
//        return nextOfKinPhoneNumber;
//    }
//
//    public void setNextOfKinPhoneNumber(Long nextOfKinPhoneNumber) {
//        this.nextOfKinPhoneNumber = nextOfKinPhoneNumber;
//    }
//
//    public String getReligion() {
//        return religion;
//    }
//
//    public void setReligion(String religion) {
//        this.religion = religion;
//    }
//
//
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", gender=" + gender +
//                ", address='" + address + '\'' +
//                ", phoneNumber=" + phoneNumber +
//                ", id='" + id + '\'' +
//                ", nextOfKin='" + nextOfKin + '\'' +
//                ", nextOfKinPhoneNumber=" + nextOfKinPhoneNumber +
//                ", religion='" + religion + '\'' +
//                '}';
//    }
//
}
