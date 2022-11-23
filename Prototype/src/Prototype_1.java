public class Prototype_1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Doc1 d1 = new Doc1();

        d1.nome = "ExemploPrototype1";
        d1.tipo = "txt";
        d1.visibilidade = "publico";
        d1.localizacao = "www.sextafeira.com.br/quero_um_10";

        System.out.println("\n");
        System.out.println(d1);
        System.out.println("\n");

        System.out.println("-----CLONE-----");
        Doc1 d2 = d1.clone();
        System.out.println(d2);

        System.out.println("\n");
        System.out.println("-----ALTERAÇÃO CLONE-----");
        d2.nome = "Mudou_só_o_clone_o_prototipo_(acima)_ficou_intactocls";
        System.out.println(d1);
        System.out.println("\n");
        System.out.println(d2);
    }
}

final class Doc1 implements Cloneable{
    String nome;
    String visibilidade;
    String tipo;
    String localizacao;     //url, path, etc

    @Override
    public Doc1 clone() throws CloneNotSupportedException{
        return (Doc1) super.clone();
    }

    @Override
    public String toString(){
        return "Doc1:\nNome: "+nome+"\nVisibilidade: "+visibilidade+"\nTipo: "+tipo+"\nLocalização: "+localizacao;
    }
}
