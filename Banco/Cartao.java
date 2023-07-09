import java.util.Scanner;

public class Cartao{
    private Conta C1;
    private Conta C2;
    private Conta C3;
    private int senha;
    private double saldo;

    public Cartao(double saldo, int senha, Conta conta1, Conta conta2, Conta conta3){
        this.senha = senha;
        this.saldo = saldo;
        this.C1 = conta1;
        this.C2 = conta2;
        this.C3 = conta3;
    }
    
    public Conta getConta(){
        return this.C1;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
        
    public boolean pagar(double valor){
        this.saldo -= valor; 
        return true;
    }
    
    public void alterarSenha(int senha){
        Scanner scan = new Scanner(System.in);
        if(senha == this.senha){
            System.out.println("Digite a nova senha:");
            int senhaNova = scan.nextInt();
            this.senha = senhaNova;
        }else{
            System.out.println("Senha incorreta");
        }
    }
    
    public int getSenha(){
        return this.senha;
    }
}