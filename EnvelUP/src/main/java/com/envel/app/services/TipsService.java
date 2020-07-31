package com.envel.app.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.envel.app.entity.Tips;
import com.envel.app.repository.ITips;

@Service
public class TipsService implements ITips{

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public Tips[] todosTips() {
		String url = "https://envelservice.azurewebsites.net/api/Tip";
		Tips[] response = restTemplate.getForObject(url, Tips[].class);
		return response;
	}
	
}
