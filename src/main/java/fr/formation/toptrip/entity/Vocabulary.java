package fr.formation.toptrip.entity;

import java.io.Serializable;

public class Vocabulary implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer vocabularyID;
	private String word;
	private String phrase;
	private Country country;
	private VocabularyCategory vocabularyCategory;
	/**
	 * @return the vocabularyID
	 */
	public Integer getVocabularyID() {
		return vocabularyID;
	}
	/**
	 * @param vocabularyID the vocabularyID to set
	 */
	public void setVocabularyID(Integer vocabularyID) {
		this.vocabularyID = vocabularyID;
	}
	/**
	 * @return the word
	 */
	public String getWord() {
		return word;
	}
	/**
	 * @param word the word to set
	 */
	public void setWord(String word) {
		this.word = word;
	}
	/**
	 * @return the phrase
	 */
	public String getPhrase() {
		return phrase;
	}
	/**
	 * @param phrase the phrase to set
	 */
	public void setPhrase(String phrase) {
		this.phrase = phrase;
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
	/**
	 * @return the vocabularyCategory
	 */
	public VocabularyCategory getVocabularyCategory() {
		return vocabularyCategory;
	}
	/**
	 * @param vocabularyCategory the vocabularyCategory to set
	 */
	public void setVocabularyCategory(VocabularyCategory vocabularyCategory) {
		this.vocabularyCategory = vocabularyCategory;
	}
}
