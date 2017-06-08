package fr.formation.toptrip.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

public class Suitcase implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer suitcaseID;

	private Set<Medecine> medecines;
	private Set<Documents> documents;
	private Set<Multimedia> multimedias;
	private Set<HygieneObjects> hygieneObjects;
	/**
	 * @return the suitcaseID
	 */
	public Integer getSuitcaseID() {
		return suitcaseID;
	}
	/**
	 * @param suitcaseID the suitcaseID to set
	 */
	public void setSuitcaseID(Integer suitcaseID) {
		this.suitcaseID = suitcaseID;
	}
	/**
	 * @return the medecines
	 */
	public Set<Medecine> getMedecines() {
		return medecines;
	}
	/**
	 * @param medecines the medecines to set
	 */
	public void setMedecines(Set<Medecine> medecines) {
		this.medecines = medecines;
	}
	/**
	 * @return the documents
	 */
	public Set<Documents> getDocuments() {
		return documents;
	}
	/**
	 * @param documents the documents to set
	 */
	public void setDocuments(Set<Documents> documents) {
		this.documents = documents;
	}
	/**
	 * @return the multimedias
	 */
	public Set<Multimedia> getMultimedias() {
		return multimedias;
	}
	/**
	 * @param multimedias the multimedias to set
	 */
	public void setMultimedias(Set<Multimedia> multimedias) {
		this.multimedias = multimedias;
	}
	/**
	 * @return the hygieneObjects
	 */
	public Set<HygieneObjects> getHygieneObjects() {
		return hygieneObjects;
	}
	/**
	 * @param hygieneObjects the hygieneObjects to set
	 */
	public void setHygieneObjects(Set<HygieneObjects> hygieneObjects) {
		this.hygieneObjects = hygieneObjects;
	}
	

}
