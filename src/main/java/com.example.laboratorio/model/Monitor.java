package com.example.laboratorio.model;

public class Monitor extends Person{
    private String career;
    private int semester;

    public Monitor(String name, String id, String career, int semester) {
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

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
}
