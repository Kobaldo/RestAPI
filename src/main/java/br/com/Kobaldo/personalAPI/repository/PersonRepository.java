package br.com.Kobaldo.personalAPI.repository;

import br.com.Kobaldo.personalAPI.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
