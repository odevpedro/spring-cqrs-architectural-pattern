package com.course.cqrs.proto_api.controllers;

import com.course.cqrs.proto_api.models.Person;
import com.course.cqrs.proto_api.services.PeopleService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/people")
public class PeopleController {


    private final PeopleService peopleService;

    public PeopleController(PeopleService peopleService) {

        this.peopleService = peopleService;
    }


    @Value("${api.version}")
    private String apiVerion;



    @GetMapping("/version")
    public String getApiVerion(){
        return apiVerion;
    }



    @GetMapping("/create-people/{quantity}")
    public String createPeople(@PathVariable("quantity") Integer quantity) {
        peopleService.generatePeople(quantity);
        return String.format("Created %d people", quantity);
    }


    @GetMapping("/")
    public ResponseEntity<List<Person>> getPeople()
    {
        return ResponseEntity.ok(peopleService.getPeople());
    }
}
