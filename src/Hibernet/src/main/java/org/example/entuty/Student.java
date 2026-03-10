package org.example.entuty;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String dept;
    private int age;
    private double marks;

    public Student(String name, String dept, int age, double marks) {
        this.name = name;
        this.dept = dept;
        this.age = age;
        this.marks = marks;
    }

    public void setMarks(double marks) {
    }
}