package br.duduslugee.projeto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class IniciarProjeto {

	public static void main(String[] args) {
		SpringApplication.run(IniciarProjeto.class, args);
	}

}
