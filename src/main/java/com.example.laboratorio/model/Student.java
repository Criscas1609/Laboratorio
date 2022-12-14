package com.example.laboratorio.model;

public class Student extends Person{

   private String career;
   private String semester;

    public Student(String name, String id, String career, String semester) {
        super(name, id);
        this.career = career;
        this.semester = semester;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }
}
