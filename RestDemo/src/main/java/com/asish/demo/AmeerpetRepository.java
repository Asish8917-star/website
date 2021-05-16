package com.asish.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AmeerpetRepository extends JpaRepository<Ameerpet, Integer> {

}
