package sn.djibi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import sn.djibi.repository.EtudiantRepository;

@SpringBootApplication
@RepositoryRestResource
public class ProjetDjibrilMicroInscriptionApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetDjibrilMicroInscriptionApplication.class, args);
	}
	@Bean
	CommandLineRunner start(EtudiantRepository etudiantRepository)
	{
		return args->{
			
			etudiantRepository.findAll().forEach(etudiant->{
				
				System.out.println(etudiant.toString());
			}
			
					);
		};

	}}
