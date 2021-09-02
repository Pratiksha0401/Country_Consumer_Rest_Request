package com.countries;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CountrriesWsdlConsumer1Application {

	public static void main(String[] args) {
		SpringApplication.run(CountrriesWsdlConsumer1Application.class, args);
	}

//	@Bean
//	CommandLineRunner lookup(CountryClient quoteClient) {
//		return args -> {
//			String country = "Poland";
//
//			if (args.length > 0) {
//				country = args[0];
//			}
//			GetCountryResponse response = quoteClient.getCountry(country);
//			//System.out.println("response="+response);
//			//System.out.println("response"+response.getCountry().getName());
//			System.out.println("Country Name : " + response.getCountry().getName());
//			System.out.println("Country' Capital Name : " + response.getCountry().getCapital());
//			System.out.println("Country' Population : " + response.getCountry().getPopulation());
//			System.out.println("Country' Currency Name : " + response.getCountry().getCurrency());
//
//		};
//	}
}
