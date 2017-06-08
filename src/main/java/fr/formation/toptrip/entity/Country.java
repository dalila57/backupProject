package fr.formation.toptrip.entity;

import java.io.Serializable;
import java.util.Set;

public class Country implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer countryID;
	private String countryName;
	private Integer emergencyNumber;
	private String money;
	private String timeZone;
	private Suitcase suitcase;
	private Set<City> cityList;
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
	/**
	 * @return the money
	 */
	public String getMoney() {
		return money;
	}
	/**
	 * @param money the money to set
	 */
	public void setMoney(String money) {
		this.money = money;
	}
	/**
	 * @return the timeZone
	 */
	public String getTimeZone() {
		return timeZone;
	}
	/**
	 * @param timeZone the timeZone to set
	 */
	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}
	/**
	 * @return the cityList
	 */
	public Set<City> getCityList() {
		return cityList;
	}
	/**
	 * @param cityList the cityList to set
	 */
	public void setCityList(Set<City> cityList) {
		this.cityList = cityList;
	}
	public Suitcase getSuitcase() {
		return suitcase;
	}
	public void setSuitcase(Suitcase suitcase) {
		this.suitcase = suitcase;
	}
	
	
}