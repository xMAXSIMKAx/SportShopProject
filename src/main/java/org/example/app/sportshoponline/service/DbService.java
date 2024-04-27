package org.example.app.sportshoponline.service;

import org.springframework.core.annotation.Order;

import java.sql.PreparedStatement;
import java.util.List;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbService {
    private static final String URL = "jdbc:mysql://localhost:3306/mydatabase";
    private static final String USERNAME = "username";
    private static final String PASSWORD = "password";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }


    public void save(Object object) {
        // код для збереження об'єкта в базі даних
        try (Connection connection = getConnection()) {
            // Виконання операції з базою даних
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Object object) {
        // код для оновлення об'єкта в базі даних
        try (Connection connection = getConnection()) {
            // Виконання операції з базою даних
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(Class<?> clazz, int id) {
        // код для видалення об'єкта з бази даних за його класом і ідентифікатором
        try (Connection connection = getConnection()) {
            // Виконання операції з базою даних
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<?> search(Class<?> clazz, String keyword) {
        // код для пошуку об'єктів з бази даних за ключовим словом
        try (Connection connection = getConnection()) {
            // Виконання операції з базою даних
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Order> getUserOrders(int userId) {
        // код для отримання замовлень користувача за його ідентифікатором
        try (Connection connection = getConnection()) {
            // Виконання операції з базою даних
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void executeUpdate(String sql, Object... params) throws SQLException {
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            // Встановлюємо параметри SQL-запиту
            for (int i = 0; i < params.length; i++) {
                statement.setObject(i + 1, params[i]);
            }
            // Виконуємо SQL-запит
            statement.executeUpdate();
        }
    }
}