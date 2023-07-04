package com.example.accountservice;

import com.example.accountservice.DTO.AuthentificationRequestDTO;
import com.example.accountservice.Service.RestApi.AuthentificationRestService;
import com.example.customerservice.web.CustomerSoapService;
import com.example.customerservice.web.CustomerWS;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class AccountServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(AuthentificationRestService authentificationService){
		return args -> {
			authentificationService.save(new AuthentificationRequestDTO("Amine","amine@amine","123"));
			authentificationService.save(new AuthentificationRequestDTO("Kenza","kenza@kenza","123"));
			authentificationService.save(new AuthentificationRequestDTO("Sara","sara@sara","123"));
			authentificationService.save(new AuthentificationRequestDTO("Rania","rania@rania","123"));
		};
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Bean
	CustomerSoapService customerSoapService(){
		return new CustomerWS().getCustomerSoapServicePort();
	}
}
