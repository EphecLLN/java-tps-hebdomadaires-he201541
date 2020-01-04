package tp03;


public class HelloWorld {
	String bonjour;
	
	HelloWorld(){
		this.bonjour = "coucou";
	}
	public String toString() {
		return bonjour;
	}
	
	public static void main(String[] args) {
		HelloWorld salut = new HelloWorld();
		System.out.println(salut);
		
	}

}
