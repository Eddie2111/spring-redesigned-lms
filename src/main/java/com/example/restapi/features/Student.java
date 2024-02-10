package com.example.restapi.features;

public class Student{

    // private static variables
    private String id;
    private String name;
    private Integer age;
    private String email;
    private String about;
    private String joining;

    // public variable class
    public Student(String id, String name, String email, Integer age){
        this.id = id;
        this.name = name;
        this.age = age;
        this.email=email;
    }

    // getter and setters
    public String getID(){
        return id;
    }
    public void setID(String id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public Integer getAge(){
        return age;
    }
    public void setAge(Integer age){
        this.age = age;
    }
    public String getAbout() {
        return about;
    }
    public void setAbout(String about) {
        this.about = about;
    }
    public String getJoining() {
        return joining;
    }
    public void setJoining(String joining) {
        this.joining = joining;
    }
    @Override
    public String toString() {
        return "Student: { id->" + id + ", name->" + name + ", age:" + age + ", email:" + email +
                ", about:" + about + ", joining:" + joining + "}";
    }
}