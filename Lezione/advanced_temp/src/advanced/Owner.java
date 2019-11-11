package advanced;

public class Owner {

	private String firstName;
	private String lastName;
	
	// Dichiaro l'array che conterra' le Car
	// possedute da questo Owner
	
	              // Inizializzazione nel/i costruttore/i
	private Car myCars[]; // = new Car[5];
	private int numCars;
	
	 public Owner() {
		firstName = "";
		lastName = "";
		myCars = new Car[5];
		numCars = 0;
	}
	
	public Owner(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		myCars = new Car[5];
		numCars = 0;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String describeYourself() {
		
		return firstName+" "+lastName;
	}
	
	// 1) Fattorizzato istruzioni di uso comune
	// 2) Concentrato il codice in un punto preciso (manutenz.)
	// 3) Possibilità di introdurre, es., controlli (errori)
	
	public boolean addCar(Car c) {
		if(numCars<=5-1) {
			myCars[numCars]=c;
			numCars++;
			return true;
		}
		
		return false;
	}
	
	public String describeWithCars() {
		String s="";
		for(int i=0;i<numCars;i++) {
			s+="Car #"+(i+1)+"\n"+myCars[i].describeYourself();
		}
		return s;
	}
	
}
