package br.com.learning.poi.model;

public enum Month {

	JANUARY("Jan"), 
	FEBRUARY("Feb"), 
	MARCH("Mar"), 
	APRIL("Apr"), 
	MAY("May"), 
	JUNE("Jun"), 
	JULY("Jul"), 
	AUGUST("Aug"), 
	SEPTEMBER("Sep"), 
	OCTOBER("Oct"), 
	NOVEMBER("Nov"), 
	DECEMBER("Dec");

	private String abbreviation;

	/**
	 * @param abbreviation
	 */
	private Month(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	/**
	 * @return the abbreviation
	 */
	public String getAbbreviation() {
		return abbreviation;
	}

}
