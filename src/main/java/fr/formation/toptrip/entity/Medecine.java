package fr.formation.toptrip.entity;

import java.io.Serializable;

public class Medecine implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer medecineID;
	private String medecineName;
	private Suitcase suitcase;
	/**
	 * @return the medecineID
	 */
	public Integer getMedecineID() {
		return medecineID;
	}
	/**
	 * @param medecineID the medecineID to set
	 */
	public void setMedecineID(Integer medecineID) {
		this.medecineID = medecineID;
	}
	/**
	 * @return the medecineName
	 */
	public String getMedecineName() {
		return medecineName;
	}
	/**
	 * @param medecineName the medecineName to set
	 */
	public void setMedecineName(String medecineName) {
		this.medecineName = medecineName;
	}
	/**
	 * @return the suitcase
	 */
	public Suitcase getSuitcase() {
		return suitcase;
	}
	/**
	 * @param suitcase the suitcase to set
	 */
	public void setSuitcase(Suitcase suitcase) {
		this.suitcase = suitcase;
	}
}
