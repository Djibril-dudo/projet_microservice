package sn.djibi.bean;

public class EtudiantBean {

	private String numero;
	private String prenom;
	private String nom;
	public EtudiantBean() {
		super();
	}
	
	

	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
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
	public EtudiantBean( String numero, String prenom, String nom) {
		super();
		this.numero = numero;
		this.prenom = prenom;
		this.nom = nom;
	}




	@Override
	public String toString() {
		return "EtudiantBean [ numero=" + numero + ", prenom=" + prenom + ", nom=" + nom + "]";
	}
	

}
