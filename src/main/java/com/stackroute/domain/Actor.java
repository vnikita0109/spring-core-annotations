package com.stackroute.domain;

public class Actor {
    private String actorName;
    private String gender;
    private int age;

    public Actor(String actorName, String gender, int age) {
        this.actorName = actorName;
        this.gender = gender;
        this.age = age;
    }

    public Actor() {

    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "actorName='" + actorName + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
