package com.bookmyshow.app.usecases;

import com.bookmyshow.app.dtos.CreateUserDTO;
import com.bookmyshow.app.models.User;
import com.bookmyshow.app.repositories.interfaces.UserRepository;
import com.bookmyshow.app.services.utils.passwordencoder.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserUsecases {
    // We're not going to change the password-encoder for different requests/usecases
    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;

    public UserUsecases(PasswordEncoder passwordEncoder, UserRepository userRepository) {
        this.passwordEncoder = passwordEncoder;
        this.userRepository = userRepository;
    }

    public User createUser(CreateUserDTO details) {
        User user = new User(details.getUsername());
        user.setPassword(details.getPassword(), passwordEncoder);
        userRepository.save(user);
        return user;
    }

    public boolean checkPasswordValid(User user, String password) {
        return user.checkPassword(password, passwordEncoder);
    }

    public void changePassword(User user, String newPassword) {
        // some other validations that might NOT belong in the User entity
        user.setPassword(newPassword, passwordEncoder);
    }
}
