package br.com.Kobaldo.personalAPI.controller;


import br.com.Kobaldo.personalAPI.DTO.MessageResponseDTO;
import br.com.Kobaldo.personalAPI.entity.Person;
import br.com.Kobaldo.personalAPI.repository.PersonRepository;
import br.com.Kobaldo.personalAPI.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/people")
public class PersonalApiApplicationController {

  private PersonService personService;

  @Autowired
  public PersonalApiApplicationController(PersonService personService) {
    this.personService = personService;
  }


  @PostMapping
  public MessageResponseDTO createPerson(@RequestBody Person person) {
    return personService.createPerson(person);
  }
}
