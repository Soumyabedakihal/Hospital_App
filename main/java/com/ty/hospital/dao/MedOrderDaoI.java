package com.ty.hospital.dao;

import java.util.List;

import com.ty.hospital.dto.MedOrder;

public interface MedOrderDaoI {
	boolean	saveMedOrder(int eid,MedOrder order);
	MedOrder getMedOrderById(int mid);
	boolean	removeMedOrder(int mid);
	boolean	updateMedOrder(int mid, MedOrder order);
	List<MedOrder> getAllMedOrderByEncounter(int eid);//enounter_id
	List<MedOrder> getAllMedOrders();
}
