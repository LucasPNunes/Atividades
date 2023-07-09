import java.util.*;

public class AgendaTelefonica{
    private	HashMap<String, Contato> colecao;
    
    public AgendaTelefonica(){
        this.colecao = new HashMap<String, Contato>();
    }
    
    public void exibir(){
        for (String i : colecao.keySet()) {
            Contato telefone = colecao.get(i);
            System.out.println("Nome: " + i + " Numero: " + telefone.getDdi() + telefone.getDdd() + telefone.getNumero());
        }
    }
    
    public void inserir(String nome, Contato telefone){
        this.colecao.put(nome, telefone);
    }
    
    public String buscarNumero(String nome){
        for (String i : colecao.keySet()) {
            Contato telefone = colecao.get(i);
            if(nome.equals(i)){
                return "Numero: " + telefone.getDdi() + telefone.getDdd() + telefone.getNumero();
            }
        }
        return "Nome não encontrado";
    }
    
    public void remover(String nome){
        for (String i : colecao.keySet()) {
            if(nome.equals(i)){
                this.colecao.remove(i);
            }
        }
    }
    
    public void tamanho(){
        System.out.println(colecao.size());
    }
    
    public boolean check(String nome){
        return nome.equals("Lucas");
    }
}
