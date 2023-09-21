package com.demomvcglassfish;

public class User {
    private String username;
    private String clave;

    public User() {
    }

    public User(String username, String clave) {
        this.username = username;
        this.clave = clave;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
}
