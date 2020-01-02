package tp1;

public class Livre {

	/**
	 * @param args
	 */
	String titre;
	string autor;
	int isbn;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Livre livre =new Livre();
		livre.titre = "Gerard";
		livre.autor = "moi";
		livre.isbn = Integer.parseInt("345678");
		System.out.println(livre.titre + " de "+ livre.autor + ": "+ livre.isbn);

	}

}
