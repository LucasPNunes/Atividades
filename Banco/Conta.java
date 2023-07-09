public class Conta{
    private double saldo;
    private Cliente dono;
    private int numero;
    
    public Conta(String nome, String endereco, String cpf, int saldo, int numero){
        this.saldo = saldo;
        this.dono = new Cliente(nome, endereco, cpf);
        this.numero = numero;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public boolean sacar(double valor){
        this.saldo -= valor; 
        return true;
                
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public Cliente getDono(){
        return this.dono;
    }
    
    public int getNumero(){
        return this.numero;
    }
    
    public boolean depositar(double valor){
        this.saldo = valor;
        return true;
    }
    
    public boolean transfere(Conta conta, double valor){
        if(this.saldo >= valor && this.saldo > 0 && conta != null){
            conta.saldo += valor; 
            this.saldo -= valor;
            return true;
        }
        
        else return false; 
    }
        
    }