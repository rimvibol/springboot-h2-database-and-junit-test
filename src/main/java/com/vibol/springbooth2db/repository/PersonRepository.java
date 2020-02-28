package com.vibol.springbooth2db.repository;

import com.vibol.springbooth2db.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Vibol rim
 */
public interface PersonRepository extends JpaRepository<Person, Integer> {
}
