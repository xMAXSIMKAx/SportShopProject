package org.example.app.sportshoponline.service;

import org.springframework.boot.autoconfigure.security.SecurityProperties;

public class NotifyService {
    private DbService dbService;

    public NotifyService(DbService dbService) {
        this.dbService = dbService;
    }

    public void sendSMS(String phoneNumber, String message) {
        // код для відправлення SMS повідомлення
    }

    public void sendEmail(String email, String subject, String body) {
        // код для відправлення Email повідомлення
    }

    public void sendNotification(SecurityProperties.User user, String message) {
        // код для відправлення повідомлення користувачеві
    }
}