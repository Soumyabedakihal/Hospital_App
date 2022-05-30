package com.ty.hospital.dto;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Observation {
	
	@Id
	private int oid;
	private String description;
	private String remarks;
	private LocalDateTime date_and_time_of_observation;
	private String doctorname;
	
	@ManyToOne
	@JoinColumn
	private Encounter encounter ;
	
	public Encounter getEncounter() {
		return encounter;
	}
	public void setEncounter(Encounter encounter) {
		this.encounter = encounter;
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public LocalDateTime getDate_and_time_of_observation() {
		return date_and_time_of_observation;
	}
	public void setDate_and_time_of_observation(LocalDateTime date_and_time_of_observation) {
		this.date_and_time_of_observation = date_and_time_of_observation;
	}
	public String getDoctorname() {
		return doctorname;
	}
	public void setDoctorname(String doctorname) {
		this.doctorname = doctorname;
	}
	
}
