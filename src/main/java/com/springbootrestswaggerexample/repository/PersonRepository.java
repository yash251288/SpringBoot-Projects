package com.springbootrestswaggerexample.repository;

import com.springbootrestswaggerexample.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonRepository extends JpaRepository<Person, Long>{
}
