package com.ty.hospital.dao;

import java.util.List;

import com.ty.hospital.dto.Hospital;

public interface HospitalDaoI {
	boolean createHospital(Hospital hospital);
	Hospital getHospitalById(int hid);
	boolean removeHospital(int hid);
	boolean updateHospital(int hid,Hospital hospital);
}
