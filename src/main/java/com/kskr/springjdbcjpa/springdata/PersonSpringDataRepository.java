package com.kskr.springjdbcjpa.springdata;

import com.kskr.springjdbcjpa.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonSpringDataRepository extends JpaRepository<Person, Integer> {
}
