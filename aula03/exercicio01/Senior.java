package exercicio01;

import exercicio01.Funcionario;

public class Senior extends Funcionario {

     private double bonus;


     public Senior(String nome, double horasTrabalhadas, double valorPago , double bonus) {
          super(nome, horasTrabalhadas, valorPago);
          this.bonus = bonus;
     }

     @Override // tá sobreescrevendo a Classe Funcionario
     public double calcularSalario(){

          return super.calcularSalario() + (getHorasTrabalhadas()/10) * bonus;

     }

     @Override
     public String exibirDados() {
      
          return super.exibirDados() + ", " + bonus;
     }
     
}
