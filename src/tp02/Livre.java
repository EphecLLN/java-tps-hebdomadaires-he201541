package tp02;

public class Livre {

	/**
	 * @param args
	 */
	String titre;
	String autor;
	int isbn;
	
	Livre(String titre, String autor, String isbn){
		this.titre = titre;
		this.autor = autor;
		this.isbn = Integer.parseInt(isbn);
	}
	
	public String toString() {
		return titre + " de "+ autor + ": "+ isbn;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Livre livre =new Livre("Gerald", "Rif", "345678");
		System.out.println(livre);

	}

}
