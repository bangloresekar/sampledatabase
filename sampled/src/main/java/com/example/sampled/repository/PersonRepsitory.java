package com.example.sampled.repository;

import com.example.sampled.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepsitory extends JpaRepository<PersonEntity,Integer> {

}
