package com.bnp.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersoDao extends JpaRepository<Person, Long> {
}
