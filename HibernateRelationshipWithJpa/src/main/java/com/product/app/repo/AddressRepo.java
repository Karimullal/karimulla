package com.product.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.app.model.Address;

public interface AddressRepo extends JpaRepository<Address, Integer>{

}
