package com.vibol.springbooth2db.api;

import com.vibol.springbooth2db.model.Person;
import com.vibol.springbooth2db.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Vibol rim
 */
@RestController
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping("/get-all-persons")
    private List<Person> getAllPersons() {
        return personService.getAllPersons();
    }

    @GetMapping("/get-person-by_id/{id}")
    private Person getPerson(@PathVariable("id") int id) {
        return personService.getPersonById(id);
    }

    @DeleteMapping("/delete-person-by-id/{id}")
    private void deletePerson(@PathVariable("id") int id) {
        personService.delete(id);
    }

    @PostMapping("/create-person")
    private int savePerson(@RequestBody Person person) {
        personService.saveOrUpdate(person);
        return person.getId();
    }
}
