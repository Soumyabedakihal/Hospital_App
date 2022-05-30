package com.ty.hospital.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Branch {
	
	@Id
	private int bid;
	private String name;
	private long telephone;
	private String email;
	
	@ManyToOne
	@JoinColumn
	private Hospital hospital;
	
	@OneToOne(mappedBy = "branchdto")
	private Address address ;
	
	@OneToMany(mappedBy = "branchdto")
	List<Encounter> encounters ;
	
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getTelephone() {
		return telephone;
	}
	public void setTelephone(long telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
