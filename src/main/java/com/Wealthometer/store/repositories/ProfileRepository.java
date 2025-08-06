package com.Wealthometer.store.repositories;

import com.Wealthometer.store.entities.Profile;
import org.springframework.data.repository.CrudRepository;

public interface ProfileRepository extends CrudRepository<Profile, Long> {
}