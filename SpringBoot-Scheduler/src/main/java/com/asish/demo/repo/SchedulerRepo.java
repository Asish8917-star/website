package com.asish.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.asish.demo.entity.Scheduler;
@Repository
public interface SchedulerRepo extends JpaRepository<Scheduler, Integer> {

}
