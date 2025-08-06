package com.Wealthometer.store.repositories;

import com.Wealthometer.store.entities.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Byte> {
}