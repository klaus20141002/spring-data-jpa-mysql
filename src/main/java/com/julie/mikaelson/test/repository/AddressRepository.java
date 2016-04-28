package com.julie.mikaelson.test.repository;

import org.springframework.data.repository.CrudRepository;

import com.julie.mikaelson.test.model.Address;

public interface AddressRepository extends CrudRepository<Address, Long> {
	
}
