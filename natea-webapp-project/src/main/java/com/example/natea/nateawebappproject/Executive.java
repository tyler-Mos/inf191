package com.example.natea.nateawebappproject;

public class Executive extends BoardOfficer {
	public Executive(String firstName, String lastName, String memberID, String email, String phoneNumber,
			String address) {
		super(firstName, lastName, memberID, email, phoneNumber, address);
		this.setType("Executive");
	}
	


}
