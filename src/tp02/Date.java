/**
 * 
 */
package tp02;

public class Date {
	
	//variables d'instance
	private int jour;
	private int mois;
	private int  annee;
	
	Date(String jour, String mois, String annee){
		this.jour = Integer.parseInt(jour);
		this.mois = Integer.parseInt(mois);
		this.annee = Integer.parseInt(annee);
	}
	

	public int getJour() {
		return jour;
	}

	public void setJour(int jour) {
		this.jour = jour;
	}

	public int getMois() {
		return mois;
	}

	public void setMois(int mois) {
		this.mois = mois;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}
	
	public String toString() {
		return jour+"/"+mois+"/"+annee;
	}
	
	public static void main(String [] args) {
		Date date = new Date(args[0],args[1],args[2]);
		System.out.println(date);
	}

}
