package advanced;

public class Car {

	// INTERNALS, INFORMATION HIDING
	private String color;
	private String brand;
	private boolean turnedOn;
	
	// Java lo "scrive" in automatico in ogni classe
	// COSTRUTTORE di DEFUALT (COSTRUTTORE "VUOTO")
	public Car() {
		color = "Red";
		brand = "Ferrari";
		turnedOn = false;
	}
	
	// Altro COSTRUTTORE (in OVERLOADING, stesso nome, ma firma diversa)
	// Riceve dei parametri, con i quali puo' inizializzare l'oggetto
	public Car(String color, String brand, boolean turnedUn) {
		this.color = color; // this. per fare riferimento agli attributi (e disambiguare)
		this.brand = brand;
		this.turnedOn = turnedOn; 
	}
	
	public Car(String c, String b) {
		color = c;
		brand = b;
		turnedOn = false;
	}
	
	// Imposta (scrittura) l'attributo color
	public void setColor(String color) { //paint
		// ...
		if(color!="")
  		   this.color = color;
		else
			System.out.println("Colore errato");
	}

	// Restituisce (lettura) l'attributo color
	public String getColor() { //giveMeTheColor
		return color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public boolean getTurnedOn() {
		return turnedOn;
	}

	public void setTurnedOn(boolean turnedOn) {
		this.turnedOn = turnedOn;
	}
	
	public void printYourself() {
		System.out.println(color+" "+brand+" "+turnedOn);
	}
	
	public String describeYourself() {
		return "Color: "+color+"\nBrand: "+brand+"\nTurned on: "+turnedOn;
	}
	
}
