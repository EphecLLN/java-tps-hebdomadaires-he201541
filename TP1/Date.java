/**
 * 
 */
package tp1;

public class Date {
	
	//variables d'instance
	int jour;
	int mois;
	int annee;
	
	public static void main(String [] args) {
		Date date = new Date();
		date.jour = Integer.parseInt(args[0]);
		date.mois = Integer.parseInt(args[1]);
		date.annee = Integer.parseInt(args[2]);
	}
}
