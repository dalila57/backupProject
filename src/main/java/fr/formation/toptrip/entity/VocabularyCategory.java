package fr.formation.toptrip.entity;

import java.io.Serializable;

public class VocabularyCategory implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer vocabularyCategoryID;
	private String vocabularyCategoryName;
	/**
	 * @return the vocabularyCategoryID
	 */
	public Integer getVocabularyCategoryID() {
		return vocabularyCategoryID;
	}
	/**
	 * @param vocabularyCategoryID the vocabularyCategoryID to set
	 */
	public void setVocabularyCategoryID(Integer vocabularyCategoryID) {
		this.vocabularyCategoryID = vocabularyCategoryID;
	}
	/**
	 * @return the vocabularyCategoryName
	 */
	public String getVocabularyCategoryName() {
		return vocabularyCategoryName;
	}
	/**
	 * @param vocabularyCategoryName the vocabularyCategoryName to set
	 */
	public void setVocabularyCategoryName(String vocabularyCategoryName) {
		this.vocabularyCategoryName = vocabularyCategoryName;
	}

}
