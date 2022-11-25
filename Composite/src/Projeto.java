import java.util.List;

public class Projeto implements Item{
	private List<Item> itens;
	
	public Projeto(List<Item> itens) {
		this.itens = itens;
	}
	
	public void addItem(Item item) {
		this.itens.add(item);
	}
	
	@Override
	public double calcularPrecoFinal() {
		double precoFinal = 0;
		for (Item item : itens) {
			precoFinal += item.calcularPrecoFinal();
			System.out.println("\nITEM " + item.calcularPrecoFinal());
		}
		return precoFinal;
	}

}