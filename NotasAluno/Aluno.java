public class Aluno{
   private long matricula;
   private double nota1b;
   private double nota2b;
   private double notaFinal;
   
   public Aluno(long matricula){
       this.matricula = matricula;
       this.nota1b = 0;
       this.nota2b = 0; 
       this.notaFinal = 0;
   }
   public long getMatricula(){
       return this.matricula;
   }
   
   public double getNota1b(){
       return this.nota1b;
   }
   
   public double getNota2b(){
       return this.nota2b;
   }
   
   public double getNotaFinal(){
       return this.notaFinal;
   }
   
   public void setNota1b(double nota){
       this.nota1b = nota;
   }
   
   public void setNota2b(double nota){
       this.nota2b = nota;
   }
   
   public void fecharNotas(){
       this.notaFinal = (nota2b + nota1b)/2;
   }
   
}