package fr.formation.toptrip.entity;

import java.io.Serializable;

public class HygieneObjects implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer hygieneObjectID;
	private String hygieneObjectName;

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
	
}
