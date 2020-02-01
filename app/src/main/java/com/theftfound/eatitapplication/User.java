package com.theftfound.eatitapplication;

public class User {

    private String Name;
    private String Password;

    public User() {
    }

    public User(String name, String Password) {
        Name = name;
        Password = Password;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        Password = Password;
    }
}
