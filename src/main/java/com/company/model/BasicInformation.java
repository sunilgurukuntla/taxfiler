package com.company.model;

import java.util.Date;
import java.util.List;

public class BasicInformation {

	private String martialStatus;
	private Name name;
	private int ssn;
	private String dateOfBirth;
	private String occupation;
	private String dateOfMarriage;
	private String firstDateOfEntyInUS;
	private String typeOfVisa;
	private String citizenship;
	
	private ContactDetails contactDetails;
	private List<ResidencyDetailsforStates> residencyDetailsforStates;
	

	public String isMartialStatus() {
		return martialStatus;
	}

	public void setMartialStatus(String martialStatus) {
		this.martialStatus = martialStatus;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}


	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getDateOfMarriage() {
		return dateOfMarriage;
	}

	public void setDateOfMarriage(String dateOfMarriage) {
		this.dateOfMarriage = dateOfMarriage;
	}

	public String getFirstDateOfEntyInUS() {
		return firstDateOfEntyInUS;
	}

	public void setFirstDateOfEntyInUS(String firstDateOfEntyInUS) {
		this.firstDateOfEntyInUS = firstDateOfEntyInUS;
	}

	public String getTypeOfVisa() {
		return typeOfVisa;
	}

	public void setTypeOfVisa(String typeOfVisa) {
		this.typeOfVisa = typeOfVisa;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public String getCitizenship() {
		return citizenship;
	}

	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}

	public String getMartialStatus() {
		return martialStatus;
	}

}
