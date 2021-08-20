package com.bookmyshow.app;

import com.bookmyshow.app.dtos.CustomerRegistrationDTO;
import com.bookmyshow.app.models.Customer;
import com.bookmyshow.app.models.Role;
import com.bookmyshow.app.repositories.interfaces.RoleRepository;
import com.bookmyshow.app.usecases.CustomerUsecases;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Main implements CommandLineRunner {
    private final CustomerUsecases customerUsecases;
    private final RoleRepository roleRepository;

    public Main(CustomerUsecases customerUsecases, RoleRepository roleRepository) {
        this.customerUsecases = customerUsecases;
        this.roleRepository = roleRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Role customerRole = new Role("customer", "allows access to ticket booking");
        Role adminRole = new Role("admin", "allows access to admin panel");
        roleRepository.save(customerRole);
        roleRepository.save(adminRole);

        Customer luffy = customerUsecases.registerCustomer(
                CustomerRegistrationDTO.builder()
                        .fullName("Monkey D. Luffy")
                        .city("Wano")
                        .email("luffy@strawhats.com")
                        .password("meat12345")
                        .username("luffy")
                        .phone("5656")
                        .build()
        );
        System.out.println(luffy);
    }
}
