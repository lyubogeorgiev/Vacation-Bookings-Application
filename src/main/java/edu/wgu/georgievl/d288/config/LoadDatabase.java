package edu.wgu.georgievl.d288.config;

import edu.wgu.georgievl.d288.dao.CustomerRepository;
import edu.wgu.georgievl.d288.entities.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    @Bean
    CommandLineRunner initDatabase(CustomerRepository repository) {
        return args -> {
            if (repository.count() < 5) {
                repository.save(new Customer("John", "Doe", "123 Atlantic Av", "33308", "801-222-3333"));
                repository.save(new Customer("Raquel", "Elli", "3101 Port Royale Blvd", "33308", "954-123-3456"));
                repository.save(new Customer("Elisa", "Smith", "123 E Las Olas Blvd", "33301", "954-324-5656"));
                repository.save(new Customer("Ron", "Curtis", "500 S Main Street", "84101", "801-092-0878"));
                repository.save(new Customer("Mark", "Reilly", "1013 Floret Lane", "84087", "801-298-3323"));
            } else {
                System.out.println("Sample customers already added to the database.");
            }
        };
    }
}
