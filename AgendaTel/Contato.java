public class Contato{
    private String numero;
    private String ddd;
    private String ddi;

    public Contato(String numero, String ddd, String ddi){
        this.numero = numero;
        this.ddd = ddd;
        this.ddi = ddi;
    }

    public String getNumero(){
        return this.numero;
    }

    public String getDdd(){
        return this.ddd;
    }

    public String getDdi(){
        return this.ddi;
    }
}