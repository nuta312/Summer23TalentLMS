package com.digital.enums;

public enum UserCredentials {

    ADMIN("Kanzada", "Kanzada.01!");

    private final String username;
    private final String password;

    UserCredentials(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
