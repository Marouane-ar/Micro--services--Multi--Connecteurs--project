package com.example.customerservice;

import com.example.customerservice.DTO.CustomerRequestDTO;
import com.example.customerservice.Service.CustomerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CustomerService customerService){
        return args -> {
          customerService.save(new CustomerRequestDTO("Amine","amine@amine"));
          customerService.save(new CustomerRequestDTO("Kenza","kenza@kenza"));
          customerService.save(new CustomerRequestDTO("Sara","sara@sara"));
          customerService.save(new CustomerRequestDTO("Rania","rania@rania"));
        };
    }
}
