package exercicio01;

public class Funcionario {

     private String nome;
	private double horasTrabalhadas, valorPago;


     public Funcionario(String nome, double horasTrabalhadas, double valorPago) {
          this.nome = nome;
          this.horasTrabalhadas = horasTrabalhadas;
          this.valorPago = valorPago; 
     }

     public double calcularSalario(){
          return horasTrabalhadas * valorPago;
     }

     public String exibirDados(){
          return nome + ", "  + horasTrabalhadas + ", " + valorPago;
     }

     public void setHorasTrabalhadas(double horasTrabalhadas) {
          if (horasTrabalhadas > 0) {
               this.horasTrabalhadas = horasTrabalhadas;
          }
     }
     
     public void setValorPago(double valorPago) {
          if (valorPago > 0) 
          this.valorPago = valorPago;
     }

 /*    public String getNome() 
          return this.nome;
     } 

     public void setNome(String nome) {
          this.nome = nome;
     }*/

     public double getHorasTrabalhadas() {
          return horasTrabalhadas;
     } 

     public double getValorPago() {
          return valorPago;
     } 




}
