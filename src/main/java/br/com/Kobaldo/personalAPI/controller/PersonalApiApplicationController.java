package br.com.Kobaldo.personalAPI.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/people")
public class PersonalApiApplicationController {

    @GetMapping
    public String getPersonal(){
        return "It's alive, bitch!!!";
    }
}
