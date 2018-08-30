package com.telekommalaysia.portal.admin.dto;
import org.springframework.http.HttpStatus;

public class ResponseDTO {

	private String responseMessage;
	private HttpStatus responseStatus;
	private String sessionToken;
		
	
	public String getSessionToken() {
		return sessionToken;
	}
	public void setSessionToken(String sessionToken) {
		this.sessionToken = sessionToken;
	}
	public String getResponseMessage() {
		return responseMessage;
	}
	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}
	public HttpStatus getResponseStatus() {
		return responseStatus;
	}
	public void setResponseStatus(HttpStatus responseStatus) {
		this.responseStatus = responseStatus;
	}
	
	
}
