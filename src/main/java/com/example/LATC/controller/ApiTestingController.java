package com.example.LATC.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.LATC.request.ClientInfo;
import com.example.LATC.request.TokenObject;

@RestController
@RequestMapping("client-info")
public class ApiTestingController {

	
	private RestTemplate restTemplate;
	
	@PostMapping
	public TokenObject createProducts(@RequestBody ClientInfo clientInfo) {
	      HttpHeaders headers = new HttpHeaders();
	      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	      headers.setContentType(MediaType.APPLICATION_JSON);
	      HttpEntity<ClientInfo> entity = new HttpEntity<ClientInfo>(clientInfo,headers);
	      
	      return restTemplate.exchange(
	         "https://idra-ump.com/test/app/extern/v1/authenticate", HttpMethod.POST, entity, TokenObject.class).getBody();
	   }
}
