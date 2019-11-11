package advanced;

public class FirstExample {

	public static void main(String[] args) {

		double d = 6.8;
		
		int i = (int) d; // TYPE CASTING
		                 // Temporaneamente
						 // considerata come int
		
		System.out.println(i);
		System.out.println(d);
		
		String s = ""+i; 
		
		i=10;
		
		if( i > 10 ) {
			System.out.println("La var. i e' maggiore di 10");
			/*if(  ) {
				
			}*/
		
		} // Necessarie solo se piu' istruzioni da ripetere
		else if(i<10)
			System.out.println("La var. i e' minore di 10");
		else
			System.out.println("La var. i e' uguale a 10");
			
		i =15;
		if( (i>10) && (i<20) )
			System.out.println("Var. i in intervallo ]10,20[");
		
		
		
		
		

		
		
		
	}

}
