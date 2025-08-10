package com.example.sampled.controller;

import com.example.sampled.model.Person;
import com.example.sampled.service.PersonService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleDController {
    @Autowired
    private PersonService pservice;
    @GetMapping("/person/{id}")
    ResponseEntity getPerson(@PathVariable Integer id)
    {
        Person p = pservice.find(id);
        if (p== null)
        {
            return ResponseEntity.notFound().build();
        }
        else {
            return ResponseEntity.ok(p);
        }

    }

}
