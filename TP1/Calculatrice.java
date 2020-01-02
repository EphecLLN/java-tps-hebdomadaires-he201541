package tp1;

public class Calculatrice {
	
	double valeurCourante;
	
	void ajoute(double n) {
		valeurCourante+=n;
	}

	void soustrait(double n) {
		valeurCourante-=n;
	}

	void carre() {
		valeurCourante*=valeurCourante;
	}
	

	public static void main(String[] args) {
		Calculatrice calcule = new Calculatrice();
		calcule.ajoute(5);
		calcule.soustrait(2);
		System.out.println(calcule.valeurCourante);
	}

}
