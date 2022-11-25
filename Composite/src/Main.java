import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Projeto projetoLan = new Projeto(new ArrayList<Item>());
		projetoLan.addItem(new Produto("RAM 256", 100));
		projetoLan.addItem(new Produto("RAM 512", 150));
		projetoLan.addItem(new Produto("PLACA DE VIDEO A4500", 2000));
		
		Projeto subProjetoServidorLan = new Projeto(new ArrayList<Item>());
		subProjetoServidorLan.addItem(new Produto("RAM 1024", 250));
		subProjetoServidorLan.addItem(new Produto("RAM 1024", 250));
		subProjetoServidorLan.addItem(new Produto("PLACA DE VIDEO B8900", 4000));
		projetoLan.addItem(subProjetoServidorLan);
		
		Projeto subProjetoCabeamentoLan = new Projeto(new ArrayList<Item>());
		subProjetoCabeamentoLan.addItem(new Produto("CABO CAT 5E 500M", 1400));
		subProjetoCabeamentoLan.addItem(new Produto("CONECTORES RJ45 x 100", 1500));
		
		projetoLan.addItem(subProjetoCabeamentoLan);
		
		System.out.println("TOTAL DO PROJETO = " + projetoLan.calcularPrecoFinal());
	}
}