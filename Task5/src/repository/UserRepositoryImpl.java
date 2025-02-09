package repository;

import model.User;

public class UserRepositoryImpl implements UserRepository {
    @Override
    public void updateId(User user, int id) {
        user.setId(id);
        System.out.println("ID was updated: " + id);
    }

    @Override
    public void updateUsername(User user, String username) {
        user.setUsername(username);
        System.out.println("Username was updated: " + username);
    }

    @Override
    public void updatePassword(User user, String password) {
        user.setPassword(password);
        System.out.println("Password was updated: " + password);
    }
}
