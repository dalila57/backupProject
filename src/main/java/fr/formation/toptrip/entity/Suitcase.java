package fr.formation.toptrip.entity;

import java.io.Serializable;
import java.util.List;

public class Suitcase implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer suitcaseID;

	private List<Medecine> medecines;
	private List<Documents> documents;
	private List<Multimedia> multimedias;
	private List<HygieneObjects> hygieneObjects;
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
	public List<Medecine> getMedecines() {
		return medecines;
	}
	/**
	 * @param medecines the medecines to set
	 */
	public void setMedecines(List<Medecine> medecines) {
		this.medecines = medecines;
	}
	/**
	 * @return the documents
	 */
	public List<Documents> getDocuments() {
		return documents;
	}
	/**
	 * @param documents the documents to set
	 */
	public void setDocuments(List<Documents> documents) {
		this.documents = documents;
	}
	/**
	 * @return the multimedias
	 */
	public List<Multimedia> getMultimedias() {
		return multimedias;
	}
	/**
	 * @param multimedias the multimedias to set
	 */
	public void setMultimedias(List<Multimedia> multimedias) {
		this.multimedias = multimedias;
	}
	/**
	 * @return the hygieneObjects
	 */
	public List<HygieneObjects> getHygieneObjects() {
		return hygieneObjects;
	}
	/**
	 * @param hygieneObjects the hygieneObjects to set
	 */
	public void setHygieneObjects(List<HygieneObjects> hygieneObjects) {
		this.hygieneObjects = hygieneObjects;
	}	
}
