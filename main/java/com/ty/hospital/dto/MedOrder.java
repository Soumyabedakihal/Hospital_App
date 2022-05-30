package com.ty.hospital.dto;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class MedOrder {

	@Id
	private int mid;
	private LocalDateTime orderTimeandDate;
	private String status;
	private int itemtotal;
	
	public Encounter getEncounter() {
		return encounter;
	}
	public void setEncounter(Encounter encounter) {
		this.encounter = encounter;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	@ManyToOne
	@JoinColumn
	private Encounter encounter ;
	
	@OneToMany
	private List<Item> items ;
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public LocalDateTime getOrderTimeandDate() {
		return orderTimeandDate;
	}
	public void setOrderTimeandDate(LocalDateTime orderTimeandDate) {
		this.orderTimeandDate = orderTimeandDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getItemtotal() {
		return itemtotal;
	}
	public void setItemtotal(int itemtotal) {
		this.itemtotal = itemtotal;
	}
}
