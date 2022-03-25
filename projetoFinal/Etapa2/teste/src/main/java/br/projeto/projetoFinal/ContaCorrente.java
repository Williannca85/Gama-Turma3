package br.projeto.projetoFinal;

public class ContaCorrente extends Conta {


     public ContaCorrente(int numero, double saldo){
          super(numero, saldo);
      } 

      public boolean sacar(double valorSaque) {
           if (getSaldo() >= valorSaque) {
                return super.sacar(valorSaque);
           }
          return false;
      }

      public boolean depositar(double valorDeposito) {
          if (valorDeposito < 0) {   
               return false;            
          }
		 this.saldo += valorDeposito; 
           return true;
	}

}

