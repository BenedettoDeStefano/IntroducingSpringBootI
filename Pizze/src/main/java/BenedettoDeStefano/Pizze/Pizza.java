package BenedettoDeStefano.Pizze;


import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pizza extends Menu {

	private List<String> toppings;
	private Size size;

	public Pizza(String nome, double prezzo, List<String> toppings, double calorie, Size size) {
		super(nome, prezzo);
		this.toppings = toppings;
		this.size = size;
	}


	@Override
	public String toString() {
		return "Pizza [Nome: " + getNome() + " Size: " + getSize() + " Prezzo:" + getPrezzo() + " Toppings:"
				+ getToppings() + "]";
	}


}
