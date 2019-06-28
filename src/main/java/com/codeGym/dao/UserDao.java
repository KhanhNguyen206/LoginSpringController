package com.codeGym.dao;

import com.codeGym.model.Login;
import com.codeGym.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {

    private static List<User> users;

    static {
        users = new ArrayList<User>();
        users.add(new User("bob", "123", "Bob", "bob@gmail.com", 50));
        users.add(new User("james", "123", "James", "james@gmail.com", 50));
        users.add(new User("ken", "123", "Ken", "ken@gmail.com", 50));
        users.add(new User("andy", "123", "Andy", "andy@gmail.com", 50));
        users.add(new User("bill gate", "123", "BillGate", "billgate@gmail.com", 50));
    }

    public static User checkLogin(Login login){
        for (User user: users){
            if (user.getAccount().equals(login.getAccount()) && user.getPassword().equals(login.getPassword())) {
                return user;
            }
        }
        return null;
    }
}
