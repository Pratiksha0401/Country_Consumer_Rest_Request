package com.countries.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.countries.client.CountryClient;
import com.countries.wsdlClasses.GetCountryRequest;
import com.countries.wsdlClasses.GetCountryResponse;
import com.countries.wsdlClasses.ObjectFactory;

@RestController
public class CountryController {

	@Autowired
	private CountryClient client;

	@GetMapping("/country")
	public GetCountryResponse getCountryDetails(@RequestParam String countryName) {
		// ObjectFactory objectFactory = new ObjectFactory();
		GetCountryRequest name = new GetCountryRequest();
		name.setName(countryName);
		// BlzServiceAdapter blzServiceAdapter=new BlzServiceAdapter();

		GetCountryResponse response = client.getCountry(countryName);
		return response;
	}

	@PostMapping("/country")
	public GetCountryResponse getCountryDetail(@RequestBody GetCountryRequest request) {
		GetCountryResponse response = client.getCountry(request);
		return response;
	}

}
