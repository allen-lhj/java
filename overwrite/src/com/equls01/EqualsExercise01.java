package com.equls01;

import java.util.Objects;

public class EqualsExercise01 {
    //判断两个Person对象的内容是否相等，如果各个属性值都一样，则返回true，反之false
    public static void main(String[] args) {
        Person person1 = new Person("jack", 20, '男');
        Person person2 = new Person("jack", 20, '男');
        System.out.println(person1.equals(person2));
    }
}

class Person {
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Person) {
            Person p = (Person)obj;
            return this.name.equals(p.name) && this.age == p.age && this.gender == p.gender;
        }
        return false;
    }
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Person person)) return false;
//        return getAge() == person.getAge() && getGender() == person.getGender() && Objects.equals(getName(), person.getName());
//    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getGender());
    }
}