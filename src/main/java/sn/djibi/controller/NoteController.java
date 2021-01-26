package sn.djibi.controller;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import sn.djibi.bean.EtudiantBean;
import sn.djibi.entity.Note;
import sn.djibi.repository.NoteRepository;

@RestController
public class NoteController {
@Autowired
private NoteRepository noteRepository;

RestTemplate restTemplate=new RestTemplate();
public String getUrlService() {
	return "http://localhost:8089/etudiants/";
	
	
}
@GetMapping("note/{numero}")
public EtudiantBean findByEtudiant(@PathVariable("numero") String numero)
{
	
return restTemplate.getForEntity(getUrlService()+numero, EtudiantBean.class).getBody();
}



@PostMapping("/note/{numero}/{valeur}")
public Note create(@PathVariable("numero") String numero,@RequestBody Note note) {
	EtudiantBean etudiantBean=findByEtudiant(numero);
	if(etudiantBean!=null) {
		
		return noteRepository.save(note);
		
	}
	throw new RuntimeErrorException(null, "il ya pas detudiant dans la base");
}
public Note update(@RequestBody Note note) {
	return noteRepository.save(note);
}
public Boolean delete(@RequestBody Note note) {
 noteRepository.delete(note);
 return true;
}
@GetMapping("note/one")
public Note getOne(@PathVariable int id) {
	return noteRepository.findById(id).get();
}
	@GetMapping("/note/listeEtud")
	public List<Note> getAll(){
		return noteRepository.findAll();
	}

}
