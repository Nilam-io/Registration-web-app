package com.nilam.registration;

import com.nilam.registration.dao.UserDAO;
import com.nilam.registration.model.User;

public class TestDAO {

    public static void main(String[] args) {

        User user = new User(
                "Nilam",
                "nilam@test.com",
                "12345"
        );

        UserDAO userDAO = new UserDAO();

        boolean result = userDAO.registerUser(user);

        if (result) {
            System.out.println("USER REGISTERED SUCCESSFULLY");
        } else {
            System.out.println("REGISTRATION FAILED");
        }
    }
}
