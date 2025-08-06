package com.Wealthometer.store.repositories;

import com.Wealthometer.store.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
