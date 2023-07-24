package BenedettoDeStefano.Pizze;

public class Drink extends Menu {

	public Drink(String nome, double prezzo, double calorie) {
		super(nome, prezzo);

	}

	@Override
	public String toString() {
		return "Drink [Nome: " + getNome() + ", Prezzo: " + getPrezzo() + "]";
	}

}
