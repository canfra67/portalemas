package com.portalemas.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter 
@AllArgsConstructor

public class AuthResponse {
	private String token;

	public AuthResponse(String token) {
		super();
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	

}
