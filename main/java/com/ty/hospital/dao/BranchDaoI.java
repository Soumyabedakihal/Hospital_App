package com.ty.hospital.dao;

import java.util.List;

import com.ty.hospital.dto.Branch;
import com.ty.hospital.dto.MedOrder;

public interface BranchDaoI {
	boolean saveBranch(int hid,Branch branch);
	Branch getBranchById(int bid);
	boolean removeBranch(int bid);
	boolean updateBranch(int bid,MedOrder order);
	List<Branch> getAllBranch();
}
