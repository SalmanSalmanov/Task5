package repository;

import model.User;

public interface UserRepository {
    void updateId(User user, int id);
    void updateUsername(User user, String username);
    void updatePassword(User user, String password);
}
