package org.example.ConfiguringBeans1;

public class Student {
    private  Class_ lophoc;
    private String name;
    private long id;

    public Student() {
    }

    public Student(Class_ lophoc, String name, long id) {
        this.lophoc = lophoc;
        this.name = name;
        this.id = id;
    }

    public Class_ getLophoc() {
        return lophoc;
    }

    public void setLophoc(Class_ lophoc) {
        this.lophoc = lophoc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "lophoc=" + lophoc +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
