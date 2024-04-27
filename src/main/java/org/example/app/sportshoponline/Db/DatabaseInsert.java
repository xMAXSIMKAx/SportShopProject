package org.example.app.sportshoponline.Db;

import org.example.app.sportshoponline.service.DbService;

import java.sql.SQLException;

public class DatabaseInsert {
    private DbService dbService;

    public DatabaseInsert(DbService dbService) {
        this.dbService = dbService;
    }

    public void insertUser(String username, String email) {
        String sql = "INSERT INTO users (username, email) VALUES (?, ?)";
        try {
            dbService.executeUpdate(sql, username, email);
            System.out.println("A new user was inserted successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        DbService dbService = new DbService();
        DatabaseInsert databaseInsert = new DatabaseInsert(dbService);
        databaseInsert.insertUser("user1", "user1@example.com");
    }
}