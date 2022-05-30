package com.ty.hospital.dao;

import java.util.List;

import com.ty.hospital.dto.Item;
import com.ty.hospital.dto.Observation;

public interface ItemDaoI {
	Item saveItem(int mid,Item item);
	Item getItemById(int item_id);
	boolean updateItem(int item_id,Observation observation);
	List<Item> getAllItemsByOrder(int mid);
}
