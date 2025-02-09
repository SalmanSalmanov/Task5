package controller;

import model.User;
import service.UserServiceImpl;

public class UserController {
    private UserServiceImpl userService;

    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    public void updateId(User user, int id) {
        userService.updateId(user, id);
    }

    public void updateUsername(User user, String username) {
        userService.updateUsername(user, username);
    }

    public void updatePassword(User user, String password) {
        userService.updatePassword(user, password);
    }
}
