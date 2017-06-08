package fr.formation.toptrip.entity;

import java.io.Serializable;

public class Multimedia implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer multimediaID;
	private String multimediaName;
	private Suitcase suitcase;
	/**
	 * @return the multimediaID
	 */
	public Integer getMultimediaID() {
		return multimediaID;
	}
	/**
	 * @param multimediaID the multimediaID to set
	 */
	public void setMultimediaID(Integer multimediaID) {
		this.multimediaID = multimediaID;
	}
	/**
	 * @return the multimediaName
	 */
	public String getMultimediaName() {
		return multimediaName;
	}
	/**
	 * @param multimediaName the multimediaName to set
	 */
	public void setMultimediaName(String multimediaName) {
		this.multimediaName = multimediaName;
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
