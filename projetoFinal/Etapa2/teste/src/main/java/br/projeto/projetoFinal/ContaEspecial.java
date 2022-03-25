package br.projeto.projetoFinal;

public class ContaEspecial extends Conta{
     private double limite;


	public ContaEspecial(int numeroConta, double saldo, double limite) {
		super(numeroConta, saldo); {
			if (limite < 0) {
				return;
			}
		}
	}
	
	
	public boolean sacar (double valorSaque){
		if (getSaldo() + limite >= valorSaque) {
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
	
/* 	public double calculaSaldo(double saldo,double valorSaque) {
		return super.getSaldo() - valorSaque;
	} */

	public double getLimite() {
		return limite;
	}
/* 	
	@Override
    public String toString() {
        return "O limite da sua Conta Especial é de: " + super.toString() + " limite: " + limite;
    } */
}
