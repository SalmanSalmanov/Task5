package service;

import model.User;
import repository.UserRepositoryImpl;

public class UserServiceImpl implements UserService {
    private UserRepositoryImpl userRepository;

    public UserServiceImpl(UserRepositoryImpl userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void updateId(User user, int id) {
        user.setId(id);
        System.out.println("ID was updated: " + id);
    }

    @Override
    public void updateUsername(User user, String username) {
        System.out.println("Username was updated: " + username);
        user.setUsername(username);
    }

    @Override
    public void updatePassword(User user, String password) {
        user.setPassword(password);
        System.out.println("Password was updated: " + password);
    }
}
