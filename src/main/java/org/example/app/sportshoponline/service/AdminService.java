package org.example.app.sportshoponline.service;

import org.example.app.sportshoponline.model.Content;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

public class AdminService {
        private DbService dbService;

        public AdminService(DbService dbService) {
            this.dbService = dbService;
        }

        public void modifyContent(Content content) {
            dbService.update(content);
        }

        public void addUser(SecurityProperties.User user) {
            dbService.save(user);
        }

        // інші методи адміністратора
    }
