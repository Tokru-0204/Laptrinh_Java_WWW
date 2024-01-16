package org.example.xmlbased;

import java.util.List;

public class Person {
    private int age;
    private List<Address> addresses;
    private List<String>  emails;
    private String name;

    public Person(int age, List<Address> addresses, List<String> emails, String name) {
        this.age = age;
        this.addresses = addresses;
        this.emails = emails;
        this.name = name;
    }

    public Person() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public List<String> getEmails() {
        return emails;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", addresses=" + addresses +
                ", emails=" + emails +
                ", name='" + name + '\'' +
                '}';
    }
}
