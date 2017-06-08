package fr.formation.toptrip.entity;

import java.io.Serializable;

public class HygieneObjects implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer hygieneObjectID;
	private String hygieneObjectName;
	private Suitcase suitcase;
	/**
	 * @return the hygieneObjectID
	 */
	public Integer getHygieneObjectID() {
		return hygieneObjectID;
	}
	/**
	 * @param hygieneObjectID the hygieneObjectID to set
	 */
	public void setHygieneObjectID(Integer hygieneObjectID) {
		this.hygieneObjectID = hygieneObjectID;
	}
	/**
	 * @return the hygieneObjectName
	 */
	public String getHygieneObjectName() {
		return hygieneObjectName;
	}
	/**
	 * @param hygieneObjectName the hygieneObjectName to set
	 */
	public void setHygieneObjectName(String hygieneObjectName) {
		this.hygieneObjectName = hygieneObjectName;
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
