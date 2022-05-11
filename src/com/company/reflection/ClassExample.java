package com.company.reflection;

public class ClassExample implements InterfaceExample {
    private String name;
    private int age;
    private int wage;

    public ClassExample(String name, int age, int wage) {
        this.name = name;
        this.age = age;
        this.wage = wage;
    }

    public String getName() {
        return name;
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

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }



    public ClassExample(int age) {
        this.age = age;
    }


    public ClassExample() {
    }

    public ClassExample(String name) {this.name = name;}

    public void showClassExampleNameWithParam(String param) {
        System.out.println(name + " : " + param);
    }

    private void convertName() {
        String name = this.getName();
        this.setName(String.valueOf(name.charAt(0)).toUpperCase());
    }

    @Override
    public String toString() {
        return "ClassExample{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", wage=" + wage +
                '}';
    }

}
