package com.asish.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.asish.entity.Teacher;
@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Integer> {

	Teacher save(Optional<Teacher> tech);

	void deleteById(Optional<Teacher> tech);

}
