package com.springboot.custsew.entities;

import java.io.Serializable;

public class Address implements Serializable{


	private static final long serialVersionUID = 1L;
	
	private int id;
	private String city;
	private String neighborhood;
	private int houseNumber;
	private String streetName;
	private String referencePoint;
	private Person morador;
	
	public Address() {
		
	}

	public Address(int id, String city, String neighborhood, int houseNumber, String streetName, String referencePoint) {
	
		this.id = id;
		this.city = city;
		this.neighborhood = neighborhood;
		this.houseNumber = houseNumber;
		this.streetName = streetName;
		this.referencePoint = referencePoint;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public int getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getReferencePoint() {
		return referencePoint;
	}

	public void setReferencePoint(String referencePoint) {
		this.referencePoint = referencePoint;
	}

	public Person getMorador() {
		return morador;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", city=" + city + ", neighborhood=" + neighborhood + ", houseNumber="
				+ houseNumber + ", streetName=" + streetName + ", referencePoint=" + referencePoint + ", morador="
				+ morador + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + id;
		result = prime * result + ((morador == null) ? 0 : morador.hashCode());
		result = prime * result + ((neighborhood == null) ? 0 : neighborhood.hashCode());
		result = prime * result + ((streetName == null) ? 0 : streetName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (id != other.id)
			return false;
		if (morador == null) {
			if (other.morador != null)
				return false;
		} else if (!morador.equals(other.morador))
			return false;
		if (neighborhood == null) {
			if (other.neighborhood != null)
				return false;
		} else if (!neighborhood.equals(other.neighborhood))
			return false;
		if (streetName == null) {
			if (other.streetName != null)
				return false;
		} else if (!streetName.equals(other.streetName))
			return false;
		return true;
	}


	
	
	
	
	
	
	

}
