package sn.djibi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.djibi.model.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant, String>{

}
