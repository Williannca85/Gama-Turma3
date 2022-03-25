package br.projeto.projetoFinalTest;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.projeto.projetoFinal.Conta;
import br.projeto.projetoFinal.ContaEspecial;

public class ContaEspecialTest {
     private Conta ce;

     @BeforeEach
     public void setup() {
         ce = new ContaEspecial(1, 100, 100);
     }
 
     @Test
     public void deveSacarValor(){      
         ce.sacar(60);
         assertEquals(40, ce.getSaldo());     
     }
}
