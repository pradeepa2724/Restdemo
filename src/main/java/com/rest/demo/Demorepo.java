package com.rest.demo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Demorepo extends JpaRepository<Customer, Long>{
}
