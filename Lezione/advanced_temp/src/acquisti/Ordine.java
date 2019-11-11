package acquisti;

public class Ordine {

	private String id;
	private Prodotto prodotti[];
	private int numProdotti;
	
	public Ordine(String id) {
		this.id = id;
		prodotti = new Prodotto[10];
		/*for(int i=0;i<10;i++)
			prodotti[i] = null; */
		numProdotti = 0;
	}

	public Prodotto[] getProdotti() {
		return prodotti;
	}

	public void setProdotti(Prodotto[] prodotti) {
		this.prodotti = prodotti;
	}
	
	public void aggiungiProdotto(Prodotto p) {
		prodotti[numProdotti++] = p;
	}
	
}
