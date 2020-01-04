package tp01;

public class Etudiant {

	String nom;
	String prenom;
	int matricule;
	Date dateNaissance;
	
	public static void main(String[] args) {
		Etudiant etu = new Etudiant();
		etu.nom = args[0];
		etu.prenom = args[1];
		etu.matricule = Integer.parseInt(args[2]);
		etu.dateNaissance = new Date();
		etu.dateNaissance.jour = Integer.parseInt(args[3]);
		etu.dateNaissance.mois = Integer.parseInt(args[4]);
		etu.dateNaissance.annee = Integer.parseInt(args[5]);
	}

}
