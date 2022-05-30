package com.ty.hospital.dao;

import java.util.List;

import com.ty.hospital.dto.Observation;

public interface ObservationDaoI {
	boolean saveObservation(int eid,Observation observation);
	Observation getObservationById(int oid);
	boolean removeObservationById(int oid);
	boolean updateObservation(int oid,Observation observation);
	List<Observation> getAllObservationByEncounter(int eid);//Encounter_id
}
