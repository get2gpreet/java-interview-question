package org.lms.interview;

public class User {
    private String name;
    private int age;

    public User(String name,int age) {
        this.name = name;
        this.age=age;
    }

    public String getName() {
        return name;
    }
    public String getEmployees(){
        return getName();
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "com.lms.User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
