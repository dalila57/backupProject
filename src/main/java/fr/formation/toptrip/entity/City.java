package fr.formation.toptrip.entity;

import java.io.Serializable;

public class City implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer cityID;
	private String cityName;
	private Country country;
	/**
	 * @return the cityID
	 */
	public Integer getCityID() {
		return cityID;
	}
	/**
	 * @param cityID the cityID to set
	 */
	public void setCityID(Integer cityID) {
		this.cityID = cityID;
	}
	/**
	 * @return the cityName
	 */
	public String getCityName() {
		return cityName;
	}
	/**
	 * @param cityName the cityName to set
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	/**
	 * @return the country
	 */
	public Country getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(Country country) {
		this.country = country;
	}	
}