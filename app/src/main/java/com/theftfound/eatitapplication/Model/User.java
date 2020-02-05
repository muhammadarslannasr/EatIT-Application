package com.theftfound.eatitapplication.Model;

public class User {

    private String Name;
    private String Password;

    public User() {
    }

    public User(String Name, String Password) {
        this.Name = Name;
        this.Password = Password;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
}
