package br.com.Kobaldo.personalAPI;

import org.apache.catalina.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.sql.SQLException;

@SpringBootApplication
public class PersonalApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonalApiApplication.class, args);
	}


}
