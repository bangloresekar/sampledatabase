package com.example.sampled.service;

import com.example.sampled.entity.PersonEntity;
import com.example.sampled.model.Person;
import com.example.sampled.repository.PersonRepsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonService {
    @Autowired
    private PersonRepsitory personRepsitory;

    public Person find (Integer id)
    {
        return personRepsitory.findById(id).map(this::toModel).orElse(null);
    }

    Person toModel(PersonEntity p)
    {
        Person p1 = new Person();
        p1.setId(p.getId());
        p1.setName(p.getName());
        return p1;
    }
}