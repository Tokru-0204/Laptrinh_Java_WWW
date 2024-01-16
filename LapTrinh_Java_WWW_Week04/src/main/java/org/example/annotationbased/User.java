package org.example.annotationbased;

public class User {
    private String password;
    private String userName;
    private Group group;

    public User() {
    }

    public User(String password, String userName, Group group) {
        this.password = password;
        this.userName = userName;
        this.group = group;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "User{" +
                "password='" + password + '\'' +
                ", userName='" + userName + '\'' +
                ", group=" + group +
                '}';
    }
}
