package com.example.laboratorio.model;

public class Teacher extends Person{
    private int yearsOfAntiguaty;
    private String career;
    private String asignature;

    public Teacher(String name, String id, int yearsOfAntiguaty, String career, String asignature) {
        super(name, id);
        this.yearsOfAntiguaty = yearsOfAntiguaty;
        this.career = career;
        this.asignature = asignature;
    }

    public int getYearsOfAntiguaty() {
        return yearsOfAntiguaty;
    }

    public void setYearsOfAntiguaty(int yearsOfAntiguaty) {
        this.yearsOfAntiguaty = yearsOfAntiguaty;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public String getAsignature() {
        return asignature;
    }

    public void setAsignature(String asignature) {
        this.asignature = asignature;
    }
}
