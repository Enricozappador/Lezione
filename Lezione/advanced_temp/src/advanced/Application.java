package advanced;

public class Application {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		System.out.println("c1");
		System.out.println("Color: "+c1.getColor()); //c1.color
		System.out.println("Brand: "+c1.getBrand());
		System.out.println("turnedOn: "+c1.getTurnedOn());
		
		// System.out.println(c1);
		
		Car c2 = new Car();

		c2.setColor("Blue");   // c2.color = "Blue";
		c2.setBrand("Audi");
		c2.setTurnedOn(true);
		
		System.out.println("\nc2");
		System.out.println("Color: "+c2.getColor());
		System.out.println("Brand: "+c2.getBrand());
		System.out.println("turnedOn: "+c2.getTurnedOn());

		System.out.println("\nc3");
		Car c3 = new Car("White","Fiat",false);
		
		//System.out.println(c3.getColor()+" "+c3.getBrand()+" "+c3.getTurnedOn());
		
		// c3.printYourself();
		
		System.out.println(c3.describeYourself());
		
		System.out.println("--- Collezione di oggetti Car ---");
		
		Car cars[] = new Car[10]; // [null][null][null][null][null]..[null]
		
		cars[0] = c1;
		cars[1] = c2;
		cars[2] = c3;
		
		/*
		 for(int i = 0; i<cars.length; i++)
			if(cars[i]!=null)
				System.out.println(cars[i].describeYourself()+"\n");
		*/
		
		// FOR EACH
		// Per ciascun oggetto Car (che chiamiamo temporaneamente
		// c) contenuto all'interno dell'array cars, vai a ...
		for( Car c : cars) // Usato quando il contatore non serve
			if(c != null)
				System.out.println(c.describeYourself()+"\n");
		
		Owner o1 = new Owner("John","Doe");
		Owner o2 = new Owner("Mary","Black");
		
		Owner owners[] = new Owner[10];
		owners[0] = o1;
		owners[1] = o2;
		
		System.out.println(o1.describeYourself());
		
		// Ora vogliamo "dire" che John Doe possiede
		// l'automobile c3 (White, Fiat, false)
		
		//o1.myCars[o1.numCars++] = c3;
		//o1.numCars++;
		
		// Se myCars, numCars sono private ...
		// ... devo passare attraverso dei metodi
		o1.addCar( c3 ); // DELEGA
		
		// Per stampare le Car possedute da o1
		
		System.out.println(o1.describeWithCars());
		
	}

}









