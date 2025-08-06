package com.Wealthometer.store.repositories;

import com.Wealthometer.store.entities.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {
}