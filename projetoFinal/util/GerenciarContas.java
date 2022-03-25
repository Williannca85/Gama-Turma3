package util;

import java.util.ArrayList;

import projetoFinal.Conta;


public class GerenciarContas {
     
     private ArrayList<Conta> contas;

     public GerenciarContas() {
         contas = new ArrayList<>();
     }

     public void adicionar(Conta c) {
        contas.add(c);
    }

      public String exibir(int numeroConta) {
        for (int i = 0; i < contas.size(); i++) {
            if (contas.get(i).getNumeroConta() == numeroConta) {
                return contas.get(i).toString();
            }
        }
        return "Não foi encontrado a conta solicitada";
    }

    private int posicao(int numeroConta) {
        for (int i = 0; i < contas.size(); i++) {
            if (contas.get(i).getNumeroConta() == numeroConta) {
                return i;
            }
        }
        return -1; // retorna -1 se não achou
    }


      public boolean depositar (int numeroConta, double valor) {
        for(int i = 0; i < contas.size(); i++) { 
            if (contas.get(i).getNumeroConta() == numeroConta) {
                return contas.get(i).depositar(valor);
            }
        }
        return false; 
        }
        
      public boolean sacar(int numeroConta, double valor) {
        for(int i = 0; i < contas.size(); i++) { 
            if (contas.get(i).getNumeroConta() == numeroConta) {
                return contas.get(i).sacar(valor);
            }
        }
        return false; 

     }  
}
