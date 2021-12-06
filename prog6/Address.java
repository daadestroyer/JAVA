package com.rvce.prog6;

public class Address {
	private String street;
	private String city;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String street, String city) {
		super();
		this.street = street;
		this.city = city;
	}

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
