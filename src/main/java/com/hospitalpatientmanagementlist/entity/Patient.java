package com.hospitalpatientmanagementlist.entity;

/**
 * Patient information
 * 
 * @author Lauro.ribeiro
 *
 */
public class Patient {

	private Integer PIDNumber;
	private String firstName;
	private String lastName;
	private String mobileNumber;
	private String email;
	private String city;

	/**
	 * @param pIDNumber
	 */
	public Patient(Integer pIDNumber) {
		super();
		PIDNumber = pIDNumber;
	}

	/**
	 * @return the pIDNumber
	 */
	public Integer getPIDNumber() {
		return PIDNumber;
	}

	/**
	 * @param pIDNumber
	 *            the pIDNumber to set
	 */
	public void setPIDNumber(Integer pIDNumber) {
		PIDNumber = pIDNumber;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the mobileNumber
	 */
	public String getMobileNumber() {
		return mobileNumber;
	}

	/**
	 * @param mobileNumber
	 *            the mobileNumber to set
	 */
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "---------------------------------------------------------------------" + "\nPID Number:" + PIDNumber
				+ "\nFirst Name:" + firstName + "\nLast Name:" + lastName + "\nMobile Number:" + mobileNumber
				+ "\nE-mail:" + email + "\nCity:" + city + "\n\n\n\n";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((PIDNumber == null) ? 0 : PIDNumber.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient other = (Patient) obj;
		if (PIDNumber == null) {
			if (other.PIDNumber != null)
				return false;
		} else if (!PIDNumber.equals(other.PIDNumber))
			return false;
		return true;
	}

}
