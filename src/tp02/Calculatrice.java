package tp02;

public class Calculatrice {
	
	//public double valeurCourante;
	private double valeurCourante;
	
	Calculatrice(double n){
		this.valeurCourante = n;
	}

	public double getValeurCourante() {
		return valeurCourante;
	}


	public void setValeurCourante(double valeurCourante) {
		this.valeurCourante = valeurCourante;
	}
	
	void ajoute(double n) {
		valeurCourante += n;
	}

	void soustrait(double n) {
		valeurCourante -= n;
	}

	void carre() {
		valeurCourante *= valeurCourante;
	}
	
	public String toString() {
		return "Valeur affichée : " + valeurCourante;
	}
	

	public static void main(String[] args) {
		Calculatrice calcule = new Calculatrice(4);
		calcule.ajoute(5);
		calcule.soustrait(2);
		calcule.carre();
		System.out.println(calcule);
	}



}
