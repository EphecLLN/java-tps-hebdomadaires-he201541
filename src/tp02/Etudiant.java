package tp02;

public class Etudiant {

	String nom;
	String prenom;
	int matricule;
	Date dateNaissance;
	
	Etudiant(String nom, String prenom, String matricule, String jour, String mois, String annee){
		this.nom = nom;
		this.prenom = prenom;
		this.matricule = Integer.parseInt(matricule);
		this.dateNaissance = new Date(jour, mois, annee);
	}
	
	public String toString() {
		return nom+" "+prenom+" "+matricule + " "+dateNaissance;
	}
	
	public static void main(String[] args) {
		Etudiant etu = new Etudiant(args[0], args[1],args[2], args[3],args[4], args[5]);
		System.out.println(etu);
	}

}
