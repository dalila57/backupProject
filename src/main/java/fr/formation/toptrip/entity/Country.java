package fr.formation.toptrip.entity;

import java.io.Serializable;

public class Country implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer countryID;
	private String countryName;
	private Integer emergencyNumber;
	/**
	 * @return the countryID
	 */
	public Integer getCountryID() {
		return countryID;
	}
	/**
	 * @param countryID the countryID to set
	 */
	public void setCountryID(Integer countryID) {
		this.countryID = countryID;
	}
	/**
	 * @return the countryName
	 */
	public String getCountryName() {
		return countryName;
	}
	/**
	 * @param countryName the countryName to set
	 */
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	/**
	 * @return the emergencyNumber
	 */
	public Integer getEmergencyNumber() {
		return emergencyNumber;
	}
	/**
	 * @param emergencyNumber the emergencyNumber to set
	 */
	public void setEmergencyNumber(Integer emergencyNumber) {
		this.emergencyNumber = emergencyNumber;
	}
	
	
	
}