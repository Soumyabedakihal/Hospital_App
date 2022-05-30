package com.ty.hospital.dao;

import java.util.List;

import com.ty.hospital.dto.Branch;
import com.ty.hospital.dto.Person;

public interface PersonDaoI {
	boolean savePerson(Person person);
	Person getPerson(long phone);
	boolean removePerson(long phone);
	boolean updatePerson(long phone,Person person);
	List<Person> getAllPerson();
}
