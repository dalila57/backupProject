package fr.formation.toptrip.entity;

import java.io.Serializable;

public class Documents implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer documentID;
	private String documentName;
	private Suitcase suitcase;
	/**
	 * @return the documentID
	 */
	public Integer getDocumentID() {
		return documentID;
	}
	/**
	 * @param documentID the documentID to set
	 */
	public void setDocumentID(Integer documentID) {
		this.documentID = documentID;
	}
	/**
	 * @return the documentName
	 */
	public String getDocumentName() {
		return documentName;
	}
	/**
	 * @param documentName the documentName to set
	 */
	public void setDocumentName(String documentName) {
		this.documentName = documentName;
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
