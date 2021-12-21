package com.rvce.prog5;

public class Address {
	private String street;
	private String city;

	public String getstreet() {
		return street;
	}

	public void setstreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + "]";
	}
}
