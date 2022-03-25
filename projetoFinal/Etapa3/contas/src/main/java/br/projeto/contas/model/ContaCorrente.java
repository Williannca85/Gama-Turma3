package br.projeto.contas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_conta_corrente")
public class ContaCorrente {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY) 
     @Column(name = "numeroConta")
     private int numeroConta;   
     
     @Column(name = "saldo")
     private double saldo;
 
     public int getNumero() {
           return numeroConta;
      }
 
      public void setNumero(int numeroConta) {
           this.numeroConta = numeroConta;
      }
 
     public double getSaldo() {
           return saldo;
      }
 
      public void setSaldo(double saldo) {
           this.saldo = saldo;
      }
}
