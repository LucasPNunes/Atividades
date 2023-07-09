public class Cliente{
    private String nome;
    private String endereco;
    private String cpf;
    
    public Cliente(String nome, String endereco, String cpf){
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getEndereco(){
        return this.endereco;
    } 
    
    public String getCpf(){
        return this.cpf;
    }
}
