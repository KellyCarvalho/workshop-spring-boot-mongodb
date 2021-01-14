package com.springboot.custsew.entities;

import java.io.Serializable;

import com.springboot.custsew.entities.enums.Genre;
import com.springboot.custsew.entities.enums.TypeAccess;


public class Person implements Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String phone;
	private String CPF;
	private Address address;
	private Genre genre;
	private TypeAccess typeAccess;
	private User user;

	public Person() {
		
	}
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}


	public Person(int id, String name, String phone, String CPF, Address address, Genre genre, TypeAccess typeAccess, User user) {

		this.id = id;
		this.name = name;
		this.phone = phone;
		this.CPF = CPF;
		this.address = address;
		this.genre = genre;
		this.typeAccess = typeAccess;
		this.user=user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public TypeAccess getTypeAccess() {
		return typeAccess;
	}

	public void setTypeAccess(TypeAccess typeAccess) {
		this.typeAccess = typeAccess;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", phone=" + phone + ", CPF=" + CPF + ", address=" + address
				+ ", genre=" + genre + ", typeAccess=" + typeAccess + ", user=" + user + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CPF == null) ? 0 : CPF.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		result = prime * result + id;
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((typeAccess == null) ? 0 : typeAccess.hashCode());
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
		Person other = (Person) obj;
		if (CPF == null) {
			if (other.CPF != null)
				return false;
		} else if (!CPF.equals(other.CPF))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (genre != other.genre)
			return false;
		if (id != other.id)
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (typeAccess != other.typeAccess)
			return false;
		return true;
	}

	
	
	
	
}
