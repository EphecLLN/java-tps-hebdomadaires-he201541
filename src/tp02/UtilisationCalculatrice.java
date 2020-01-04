/**
 * 
 */
package tp02;

/**
 * @author user
 *
 */
public class UtilisationCalculatrice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculatrice calcule = new Calculatrice(4);
		calcule.ajoute(5);
		calcule.soustrait(2);
		calcule.carre();
		System.out.println(calcule);
	}

}
