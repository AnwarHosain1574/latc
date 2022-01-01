package com.example.LATC.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.LATC.entity.MoneyReceipt;
import com.example.LATC.repository.MoneyReceiptRepository;
import com.example.LATC.request.AuthenticationRequest;
import com.example.LATC.request.GetResponseFromAuthentication;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("authentication")
public class RestTemplateController {

	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	MoneyReceiptRepository moneyRepo;
	
	@Autowired
	ObjectMapper mapper = new ObjectMapper();


	@PostMapping
	public String getResponse() {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		AuthenticationRequest product = new AuthenticationRequest();
		product.setClient_id("sikder");
		product.setClient_secret("HMDPzmwbcW");
		HttpEntity<AuthenticationRequest> entity = new HttpEntity<AuthenticationRequest>(product, headers);
		
		String responseFromApi = restTemplate.exchange(
         "https://idra-ump.com/test/app/extern/v1/authenticate", HttpMethod.POST, entity, String.class).getBody();
		return responseFromApi;
	}
	
	@PostMapping(value = "send-to-server")
	public String sendToServer() throws JsonMappingException, JsonProcessingException {

		// taking access token from api
		String responseObj = getResponse();
		// set access token into our object
		GetResponseFromAuthentication response = mapper.readValue(responseObj, GetResponseFromAuthentication.class);

		// set headers from response
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.add("Authorization", "Bearer "+response.getAccess_token());
		
		System.out.println(response.getAccess_token());
		
		// get all money receipt from database
		List<MoneyReceipt> moneyReceiptList = moneyRepo.findAll();
		
		System.out.println(moneyReceiptList.size());
		
		for(MoneyReceipt money : moneyReceiptList) {
			money.setId(null);
			
			HttpEntity<MoneyReceipt> entity = new HttpEntity<MoneyReceipt>(money, headers);			
			String responseFromApi = restTemplate.exchange(
					"https://idra-ump.com/test/app/extern/v1/money-receipt", HttpMethod.POST, entity, String.class).getBody();
			System.out.println(responseFromApi);	
		}
		
		return null;
		
	}
	
	
}
