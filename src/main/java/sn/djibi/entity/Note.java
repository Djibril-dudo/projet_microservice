package sn.djibi.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Note {
	@Id @GeneratedValue
	private int id;
	private String numero;
	private String nomMatier;
	private Long note;

	public Note() {
	}

	public Note(int id, String numero, String nomMatier, Long note) {
		super();
		this.id = id;
		this.numero = numero;
		this.nomMatier = nomMatier;
		this.note = note;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getNomMatier() {
		return nomMatier;
	}
	public void setNomMatier(String nomMatier) {
		this.nomMatier = nomMatier;
	}
	public Long getNote() {
		return note;
	}
	public void setNote(Long note) {
		this.note = note;
	}


}
