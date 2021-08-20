package com.bookmyshow.app.models;

import com.bookmyshow.app.exceptions.validation.InvalidUsernameException;
import com.bookmyshow.app.exceptions.validation.PasswordTooSimpleException;
import com.bookmyshow.app.services.utils.passwordencoder.PasswordEncoder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "users")
public class User extends Auditable {
    // authentication
    private String username;
    private String hashedSaltedPassword;

    // authorization
    @ManyToMany
    private Set<Role> roles = new HashSet<>();

    public User(String username) {
        this.username = username;
    }

    public void setUsername(String username) {
        // validate
        if (username.length() < 2) {
            throw new InvalidUsernameException("Must have atleast 3 letters");
        }
        this.username = username;
    }

    public void setPassword(String password, PasswordEncoder passwordEncoder) {
        if (password.length() < 8) {
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

    public void addRole(Role role) {
        this.roles.add(role);
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", hashedSaltedPassword='" + hashedSaltedPassword + '\'' +
                ", roles=" + roles +
                super.toString() +
                '}';
    }
}

// Fat models
// Anemic models -> Anemia - shortage of blood

// Composition over Inheritance
// Bridge / Composite / Databases