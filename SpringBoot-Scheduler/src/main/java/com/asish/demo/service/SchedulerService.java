package com.asish.demo.service;

import java.util.Date;
import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.asish.demo.entity.Scheduler;
import com.asish.demo.repo.SchedulerRepo;

@Service
public class SchedulerService {
	@Autowired
	private SchedulerRepo repo;
	Logger log=LoggerFactory.getLogger(SchedulerService.class);
	
	@Scheduled(fixedRate = 5000)
	public void addToDB() {
		Scheduler s=new Scheduler();
		s.setName("scheduler: "+new Random().nextInt(35678));
		repo.save(s);
		System.out.println("Add service call : "+new Date());
	}
	@Scheduled(cron = "0/15 * * * * *")
	public void fetch() {
		List<Scheduler>l=repo.findAll();
		System.out.println("fetch service call: "+new Date().toString());
		System.out.println("no. of records fetched "+l.size());
		log.info("scheduler {}",l);
	}

}
