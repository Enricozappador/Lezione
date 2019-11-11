package advanced;

public class Stringhe {

	public static void main(String[] args) {
		
		String s1 = "La mia prima stringa"; 
		
		int l = s1.length();
		
		System.out.println(s1);
		System.out.println("Lunghezza: "+l);
		
		String s2 = "La mia prima stringa";
		
		if(s1.compareTo(s2)==0)
			System.out.println("Contenuto uguale");
		else
			System.out.println("Contenuto diverso");
		
		/*
		if(s1==s2) // In linea di principio, errato
			System.out.println("Contenuto uguale");
		else
			System.out.println("Contenuto diverso");
		*/
		
		String s3 = s2.toUpperCase();
		System.out.println(s3);
		
		if(s2.contains("prima"))
			System.out.println("Presente");
		else
		System.out.println("Assente");
		
		int p = s2.indexOf("prima");
		System.out.println("Posizione: "+p);
		
		String s4 = s2.substring(7);
		System.out.println(s4);
		
		// Per accedere al carattere i-esimo
		// in C array[i]

		char c = s2.charAt(8);
		System.out.println(c);
	}

}




