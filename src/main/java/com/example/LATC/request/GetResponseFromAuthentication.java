package com.example.LATC.request;

public class GetResponseFromAuthentication {
	
	private String access_token;
	private String refresh_token;
	private String token_type;
	private String access_token_expire_in;
	private String refresh_token_expire_in;
	
	
	public String getAccess_token() {
		return access_token;
	}
	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}
	public String getRefresh_token() {
		return refresh_token;
	}
	public void setRefresh_token(String refresh_token) {
		this.refresh_token = refresh_token;
	}
	public String getToken_type() {
		return token_type;
	}
	public void setToken_type(String token_type) {
		this.token_type = token_type;
	}
	public String getAccess_token_expire_in() {
		return access_token_expire_in;
	}
	public void setAccess_token_expire_in(String access_token_expire_in) {
		this.access_token_expire_in = access_token_expire_in;
	}
	public String getRefresh_token_expire_in() {
		return refresh_token_expire_in;
	}
	public void setRefresh_token_expire_in(String refresh_token_expire_in) {
		this.refresh_token_expire_in = refresh_token_expire_in;
	}
	
}
