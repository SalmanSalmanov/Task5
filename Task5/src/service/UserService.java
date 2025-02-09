package service;

import model.User;

public interface UserService {
    void updateId(User user, int id);
    void updateUsername(User user, String username);
    void updatePassword(User user, String password);
}
