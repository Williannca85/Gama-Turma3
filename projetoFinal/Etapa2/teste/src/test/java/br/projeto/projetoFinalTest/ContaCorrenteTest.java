package br.projeto.projetoFinalTest;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.projeto.projetoFinal.Conta;
import br.projeto.projetoFinal.ContaCorrente;

public class ContaCorrenteTest {
     private Conta cc;

     @BeforeEach
     public void setup(){
          cc = new ContaCorrente(1111, 500); 
      }
 
     @Test
     public void deveSacar(){      
         cc.sacar(300);
         assertEquals(200, cc.getSaldo()); 
/*          assertEquals(0, c.getSaldo());   */
     }
 
     @Test
     public void deveDepositarValor(){       
         cc.depositar(50);
          assertEquals(550, cc.getSaldo()) ;         
     }    
}
