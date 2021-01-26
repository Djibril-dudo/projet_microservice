package sn.djibi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import sn.djibi.model.Etudiant;
import sn.djibi.repository.EtudiantRepository;


@RestController
public class EtudiantController {
	@Autowired
	private EtudiantRepository etudiantRepository;
	@PostMapping("/etudiants")
	public Etudiant create(@RequestBody Etudiant etudiant) {
		Etudiant etudiant2=etudiantRepository.save(etudiant);
		
		return etudiant2;
	}
	@PutMapping("/update")
	public Etudiant update(@RequestBody Etudiant etudiant) {
        Etudiant etudiant2=etudiantRepository.save(etudiant);
		
		return etudiant2;
	}
	@GetMapping("/etudiants/{numero}")
	public Etudiant getNumero(@PathVariable String numero) {
		return etudiantRepository.findById(numero).get();
	}
	@GetMapping("/etudiants/liste")
	public List<Etudiant> getAll(){
		return etudiantRepository.findAll();
	}


}
