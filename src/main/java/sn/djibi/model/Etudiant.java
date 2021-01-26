package sn.djibi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Etudiant {
	 
//	@GeneratedValue

	//private Long id;
	@Id
	private String numero;
	private String prenom;
	private String nom;
	public Etudiant() {
		super();
	}




	/*public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}*/
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero= numero;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Etudiant( String numero, String prenom, String nom) {
		super();
	//	this.id = id;
		this.numero = numero;
		this.prenom = prenom;
		this.nom = nom;
	}


}
	