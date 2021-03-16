package com.singgihsuryop.springboot.springdata.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the PERSON database table.
 * 
 */
@Entity
@Table(name="PERSON")
@NamedQuery(name="PersonEntity.findAll", query="SELECT p FROM PersonEntity p")
public class PersonEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PERSON_ID")
	private String personId;

	@Column(name="ADDRESS")
	private String address;

	@Column(name="AGE")
	private int age;

	@Temporal(TemporalType.DATE)
	@Column(name="BIRTH_DATE")
	private Date birthDate;

	@Column(name="EMAIL")
	private String email;

	@Column(name="GENDER")
	private String gender;

	@Column(name="NAME")
	private String name;

	@Column(name="STATUS")
	private String status;

	@Column(name="TELEPHONE")
	private String telephone;

	public PersonEntity() {
	}

	public String getPersonId() {
		return this.personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Override
	public String toString() {
		return "PersonEntity [personId=" + personId + ", address=" + address + ", age=" + age + ", birthDate="
				+ birthDate + ", email=" + email + ", gender=" + gender + ", name=" + name + ", status=" + status
				+ ", telephone=" + telephone + "]";
	}
	
}
