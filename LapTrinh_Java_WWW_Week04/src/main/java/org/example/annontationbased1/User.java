package org.example.annontationbased1;

import org.springframework.beans.factory.annotation.Autowired;

public class User {
    @Autowired
    private Group group;
    private String userName;
    private String password;

    public User() {
    }

    public User(Group group, String userName, String password) {
        this.group = group;
        this.userName = userName;
        this.password = password;
    }

    @Autowired
    public User(Group group) {
        this.group = group;
    }

    public Group getGroup() {
        return group;
    }

    @Autowired
    public void setGroup(Group group) {
        this.group = group;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "group=" + group +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public void doFoo() {
    }
}
