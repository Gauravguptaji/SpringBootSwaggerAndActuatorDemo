package com.app.sba.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table

public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	@Column
	private String name;
	@Column
	private String address;
	@Column
	private String contact;

	public Student() {

	}

	public Student(int id, String name, String address, String contact) {

		this.id = id;
		this.name = name;
		this.address = address;
		this.contact = contact;
	}
	public Student(String name, String address, String contact) {

	
		this.name = name;
		this.address = address;
		this.contact = contact;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", contact=" + contact + "]";
	}

}