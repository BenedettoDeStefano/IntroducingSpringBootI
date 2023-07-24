package BenedettoDeStefano.Pizze;

public class Merchandise extends Menu {

	public Merchandise(String nome, double prezzo) {
		super(nome, prezzo);
	}

	@Override
	public String toString() {
		return "Merchandise [Nome: " + getNome() + ", Prezzo: " + getPrezzo() + "]";
	}

}
