package com.example.demo.service;

import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class PersonService {
    private static List<Person> DB = new ArrayList<>();

    public void addPerson(Person person) {
        UUID id = UUID.randomUUID();
        DB.add(new Person(id, person.getName()));
    }

    public List<Person> getAllPeople() {
        return DB;
    }
}
