package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Chee");
        student.setSurname("Rna");
        student.setMidname("Burka");
        student.setGroup("foxies");
        student.setReceipt(new Date());
        System.out.print(student.getName() + " " + student.getSurname() + " " + student.getMidname() + " Receipt " + student.getReceipt() + " in group " + student.getGroup());
    }
}
