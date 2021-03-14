package com.company;

import java.util.Date;

public class User {
    private String firstName;
    private String secondName;
    private String dateOfBirth;
    private String age;
    private int id;
    private static int id_gen = 0;
    private String password;

    public User(){

        id = id_gen++;
    }

    public User(String firstName, String secondName){
        this();
        setFirstName(firstName);
        setSecondName(secondName);
    }

    public User(String firstName, String secondName, String age, String dateOfBirth, String password){
        this(firstName, secondName);
        setAge(age);
        setDateOfBirth(dateOfBirth);
        setPassword(password);
    }

    public void printFirstName(){
        System.out.println(getFirstName());
    }



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
