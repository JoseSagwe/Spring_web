package com.test.model;

public class Student {

    private String f_name;
    private String l_name;
    private int age;

    public Student(String f_name, String l_name, int age) {
        this.f_name = f_name;
        this.l_name = l_name;
        this.age = age;
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getL_name() {
        return l_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "f_name='" + f_name + '\'' +
                ", l_name='" + l_name + '\'' +
                ", age=" + age +
                '}';
    }
}
