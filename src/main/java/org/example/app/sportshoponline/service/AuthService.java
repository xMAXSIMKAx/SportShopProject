package org.example.app.sportshoponline.service;

public class AuthService {
    private DbService dbService;

    public AuthService(DbService dbService) {
        this.dbService = dbService;
    }

    public boolean authenticateUser(String username, String password) {
        // код для перевірки автентифікації користувача
        return false;
    }

    public boolean isAdmin(int userId) {
        // код для перевірки, чи є користувач адміністратором
        return false;
    }
}