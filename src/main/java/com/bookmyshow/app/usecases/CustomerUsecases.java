package com.bookmyshow.app.usecases;

import com.bookmyshow.app.dtos.CreateUserDTO;
import com.bookmyshow.app.dtos.CustomerRegistrationDTO;
import com.bookmyshow.app.dtos.UpdateCustomerDTO;
import com.bookmyshow.app.exceptions.accounts.AccountAlreadyExistsException;
import com.bookmyshow.app.exceptions.validation.UsernameTakenException;
import com.bookmyshow.app.models.Customer;
import com.bookmyshow.app.models.Role;
import com.bookmyshow.app.models.User;
import com.bookmyshow.app.repositories.interfaces.CustomerRepository;
import com.bookmyshow.app.repositories.interfaces.RoleRepository;
import com.bookmyshow.app.repositories.interfaces.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerUsecases {
    private final UserRepository userRepository;
    private final UserUsecases userUsecases;
    private final CustomerRepository customerRepository;
    private final RoleRepository roleRepository;

    public CustomerUsecases(UserRepository userRepository, UserUsecases userUsecases, CustomerRepository customerRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.userUsecases = userUsecases;
        this.customerRepository = customerRepository;
        this.roleRepository = roleRepository;
    }
    // have very little logic
    // most of the stuff that it will accomplish
    // it will do it by "delegating"
    // things to repository / external-services

    // DTO - Data Transfer Object
    // When you move data across layers
    public Customer registerCustomer(CustomerRegistrationDTO details) {
        // check if the username/phone/email is unique
        if (userRepository.findUserByUsername(details.getUsername()).isPresent()) {
            throw new UsernameTakenException(details.getUsername() + " is not available");
        }
        if (customerRepository.findCustomerByPhone(details.getPhone()).isPresent()) {
            throw new AccountAlreadyExistsException("Account with phone " + details.getPhone() + " already exists. Please login");
        }
        if (customerRepository.findCustomerByEmail(details.getEmail()).isPresent()) {
            throw new AccountAlreadyExistsException("Account with email " + details.getEmail() + " already exists. Please login");
        }
        // checking whether the phone/email is structurally correct is not our responsibility
        User user = userUsecases.createUser(new CreateUserDTO(details.getUsername(), details.getPassword()));
        Role customerRole = roleRepository.getRoleByName("customer").get();
        user.addRole(customerRole);
        userRepository.save(user);

        Customer customer = new Customer(user);
        customer.setCity(details.getCity());
        customer.setFullName(details.getFullName());
        customer.setPhone(details.getPhone());
        customer.setEmail(details.getEmail());
        customerRepository.save(customer);
        return customer;
    }

    public void deleteCustomer(Customer customer) {
    }

    public Customer updateCustomer(Customer customer, UpdateCustomerDTO details) {
        if (details.getPhone() != null) {
            Optional<Customer> existing = customerRepository.findCustomerByPhone(details.getPhone());
            if (existing.isEmpty() || !existing.get().equals(customer)) {
                throw new AccountAlreadyExistsException("Account with phone " + details.getPhone() + " already exists. Please login");
            }
            customer.setPhone(details.getPhone());
        }
        if (details.getEmail() != null) {
            Optional<Customer> existing = customerRepository.findCustomerByPhone(details.getPhone());
            if (existing.isEmpty() || !existing.get().equals(customer)) {
                throw new AccountAlreadyExistsException("Account with email " + details.getEmail() + " already exists. Please login");
            }
            customer.setEmail(details.getEmail());
        }
        if (details.getCity() != null) {
            customer.setCity(details.getCity());
        }
        if (details.getFullName() != null) {
            customer.setFullName(details.getFullName());
        }
        customerRepository.save(customer);
        return customer;
    }
}
