package sn.djibi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import sn.djibi.entity.Note;
@RepositoryRestResource
public interface NoteRepository extends JpaRepository<Note, Integer>{

}