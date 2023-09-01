package controller;

import Services.UserService;
import Entity.User;
public class UserControl {
    private UserService userService = new UserService();

    public User getUser(String userName, String password) {
        return userService.getUser(userName, password);
    }

    public boolean userRegister(User user) {
        return userService.userRegister(user);
    }
}