package org.example.app.sportshoponline.Db;

import org.example.app.sportshoponline.service.DbService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DatabaseQuery {
        private DbService dbService;

        public DatabaseQuery(DbService dbService) {
            this.dbService = dbService;
        }

        public void getUserById(int userId) {
            String sql = "SELECT * FROM users WHERE id = ?";
            try (Connection connection = dbService.getConnection();
                 PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setInt(1, userId);
                try (ResultSet resultSet = statement.executeQuery()) {
                    while (resultSet.next()) {
                        String username = resultSet.getString("username");
                        String email = resultSet.getString("email");
                        System.out.println("Username: " + username + ", Email: " + email);
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
