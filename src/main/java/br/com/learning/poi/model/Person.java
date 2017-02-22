package br.com.learning.poi.model;

import java.util.Date;

public final class Person {

	private String name;
	private Date birthDate;
	private String country;
	
	/**
	 * @param name
	 * @param birthDate
	 * @param country
	 */
	public Person(String name, Date birthDate, String country) {
		super();
		this.name = name;
		this.birthDate = birthDate;
		this.country = country;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @return the birthDate
	 */
	public Date getBirthDate() {
		return birthDate;
	}
	
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	
}
