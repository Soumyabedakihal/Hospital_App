package com.ty.hospital.dao;

import com.ty.hospital.dto.Address;

public interface AddressDaoI {
	boolean saveAddress(int bid,Address address);
	Address getAddressById(int aid);
	boolean removeAddress(int aid);
}
