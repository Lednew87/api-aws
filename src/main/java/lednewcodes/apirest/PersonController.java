package lednewcodes.apirest;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PersonController {
    private final PersonRepository repositoryPerson;

    public PersonController(PersonRepository repositoryPerson) {
        this.repositoryPerson = repositoryPerson;
    }
    @GetMapping("/")
    public String restAPI(){
        return ("API Rest Spring Boot test.");
    }
    //Requisitions methods
    @GetMapping("/persons")
    public List<Person> consultAllPersons() {
        return (List<Person>) repositoryPerson.findAll();
    }
    @GetMapping("/persons/{id}")
    public Optional<Person> consultById(@PathVariable Long id) {
        return repositoryPerson.findById(id);
    }
}
