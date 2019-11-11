package acquisti;

public class AppAcquisti {

	public static void main(String[] args) {
		
		Prodotto prodotti[] = new Prodotto[100];
		
		// Prodotto p1 = new Prodotto( ...);
		
		prodotti[0] = new Prodotto (10, "Smarphone", "Bello", 1000);
		prodotti[1] = new Prodotto (20, "Tablet", "Brutto", 25);
		
		Prodotto p1 = new Prodotto (11, "Smartphone", "Favoloso", 2000);
		
		String s = prodotti[0].descriviti();
		System.out.println(s);
		
		Ordine ordini[] = new Ordine[10000];
		Ordine o1 = new Ordine("0001");
		
		ordini[0] = o1;
		
		// Nell'ordine 0001 è stato acquistato 
		// un prodotto 11 (smartphone favoloso)
		
		//o1.prodotti[0] = p1;
		
		o1.getProdotti()[0] = p1;
		
		o1.aggiungiProdotto(p1); // Delega al Ordine l'aggiunta del prodotto
		
	}

}






