import java.util.HashMap;
import java.util.Map;

public class Prototype_2 {
    public static void main(String[] args) {
        DocumentosRegistryEstatico registry = DocumentosRegistryEstatico.getInstance();
        System.out.println("TESTE AQUI");
        Doc2 pdfRestrito = registry.getDoc2("PDF RESTRITO");

        System.out.println("\n");
        System.out.println(pdfRestrito);
    }
}

final class Doc2 implements Cloneable{
    String nome;
    String visibilidade;
    String tipo;
    String localizacao;     //url, path, etc

    @Override
    public Doc2 clone() throws CloneNotSupportedException{
        return (Doc2) super.clone();
    }

    @Override
    public String toString(){
        return "Doc2:\nNome: "+nome+"\nVisibilidade: "+visibilidade+"\nTipo: "+tipo+"\nLocalização: "+localizacao;
    }
}

final class DocumentosRegistryEstatico{

    private static final DocumentosRegistryEstatico INSTANCE = new DocumentosRegistryEstatico();
    private static final Map<String, Doc2> REGISTRY = new HashMap<>();
    
    static{
        Doc2 dre1 = new Doc2();
        dre1.tipo = "PDF";
        dre1.visibilidade = "RESTRITO";
        REGISTRY.put("PDF RESTRITO", dre1);

        Doc2 dre2 = new Doc2();
        dre2.tipo = "PDF";
        dre2.visibilidade = "PUBLICO";
        REGISTRY.put("PDF PUBLICO", dre2);

        Doc2 dre3 = new Doc2();
        dre3.tipo = "DOC";
        dre3.visibilidade = "RESTRITO";
        REGISTRY.put("DOC RESTRITO", dre3);

        Doc2 dre4 = new Doc2();
        dre4.tipo = "DOC";
        dre4.visibilidade = "PUBLICO";
        REGISTRY.put("DOC PUBLICO", dre4);
    }

    public static DocumentosRegistryEstatico getInstance(){
        return INSTANCE;
    }
    public Doc2 getDoc2(String chave){
        try{
            return REGISTRY.get(chave).clone();
        }catch(CloneNotSupportedException e){
            throw new RuntimeException(e);
        }
    }
}
