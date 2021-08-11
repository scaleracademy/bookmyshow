package com.bookmyshow.app.models;

import com.bookmyshow.app.exceptions.validation.InvalidUsernameException;
import com.bookmyshow.app.exceptions.validation.PasswordTooSimpleException;
import com.bookmyshow.app.service.utils.passwordencoder.PasswordEncoder;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class User extends Auditable {
    // authentication
    private String username;
    private String hashedSaltedPassword;

    // authorization
    private Set<Role> roles;

    @Override
    public User clone() {
        User obj = new User();
        obj.username = this.username;
        // make a perfect copy
        return obj;
    }


    public void setUsername(String username) {
        // validate
        if(username.length() < 2) {
            throw new InvalidUsernameException("Must have atleast 3 letters");
        }
        this.username = username;
    }

    public void setPassword(String password, PasswordEncoder passwordEncoder) {
        if(password.length() < 8) {
            throw new PasswordTooSimpleException("must have atleast 8 characters");
        }
        String salt = "salt"; // from some service
        this.hashedSaltedPassword = passwordEncoder.encode(password + salt);
        this.hashedSaltedPassword += ";" + salt;
    }


    public boolean checkPassword(String password, PasswordEncoder passwordEncoder) {
        // this method checks whether the given password
        // matches the actual password
        String salt = this.hashedSaltedPassword.split(";")[1];
        // password-encoder is a dependency that we need
        String encoded = passwordEncoder.encode(password + salt) + salt;
        return encoded.equals(this.getHashedSaltedPassword());
    }
}

// Fat models
// Anemic models -> Anemia - shortage of blood

// Composition over Inheritance
// Bridge / Composite / Databases