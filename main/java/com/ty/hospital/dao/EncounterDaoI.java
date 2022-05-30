package com.ty.hospital.dao;

import java.util.List;

import com.ty.hospital.dto.Encounter;

public interface EncounterDaoI {
	Boolean	createEncounter	(int bid, int pid ,Encounter encounter);
	Encounter getEncounterById(int eid);
	Boolean	removeEncounter(int eid);
	Boolean	updateEncounter(int eid,Encounter encounter);
	List<Encounter>	getAllEncounterByPerson(int pid);
	List<Encounter>	getAllEncounterByBranch	(int bid);
	List<Encounter>	getAllEncounterByStatus	(int status);
}
