package com.ty.hospital.dto;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Encounter {
	
	@Id
	private int eid;
	private LocalDateTime admission_date_and_time;
	private String reason_of_admission;
	private String discharge_date_and_time;
	private int status;
	
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public List<Observation> getObservations() {
		return observations;
	}
	public void setObservations(List<Observation> observations) {
		this.observations = observations;
	}
	public List<MedOrder> getMedOrders() {
		return medOrders;
	}
	public void setMedOrders(List<MedOrder> medOrders) {
		this.medOrders = medOrders;
	}
	@ManyToOne
	@JoinColumn
	private Branch branch ;
	
	@ManyToOne
	@JoinColumn
	private Person person ;
	
	@OneToMany(mappedBy = "encounter")
	private List<Observation> observations ;
	
	@OneToMany(mappedBy = "encounter")
	private List<MedOrder> medOrders ;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public LocalDateTime getAdmission_date_and_time() {
		return admission_date_and_time;
	}
	public void setAdmission_date_and_time(LocalDateTime admission_date_and_time) {
		this.admission_date_and_time = admission_date_and_time;
	}
	public String getReason_of_admission() {
		return reason_of_admission;
	}
	public void setReason_of_admission(String reason_of_admission) {
		this.reason_of_admission = reason_of_admission;
	}
	public String getDischarge_date_and_time() {
		return discharge_date_and_time;
	}
	public void setDischarge_date_and_time(String discharge_date_and_time) {
		this.discharge_date_and_time = discharge_date_and_time;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
}
