package br.almeida;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

      //Teste na classe sem a main, somente o objeto

      private Calculadora c;

     @BeforeEach
     public void setup(){

          c = new Calculadora();
     }
    
     @Test
     public void deveRetornarASomaDosValores(){

          double resultado = c.somar(10,20);
     
         // assertEquals(expected, actual);
         
          assertEquals(30, resultado);

     }

     @Test
     public void deveRetornarASubtracaoDosValores(){

          double resultado = c.subtrair(20,10);
     
          // assertEquals(expected, actual);
          
           assertEquals(10, resultado);
     }
      //Teste na classe sem a main, somente o objeto
     @Test
     public void deveRetornarAMultiplicacaoDosValores(){

          double resultado = c.mulltiplica(20,10);
     
          // assertEquals(expected, actual);
          
           assertEquals(200, resultado);
     }
     @Test
     public void deveRetornarADivisaoQuandoDenominadorEDiferenteDeZero(){

          double resultado = c.divide(20,10);
     
          // assertEquals(expected, actual);
          
           assertEquals(2, resultado);
     }
     
    @Test
    public void deveRetornarNegativoSeDivididoPorZero(){

           double resultado = c.divide(20,0);
     
          // assertEquals(expected, actual);
          
           assertEquals(-1, resultado);

    }

     @Test
     public void deveRetornarORestoDosValores(){

          double resultado = c.resto(5,2);
     
          // assertEquals(expected, actual);
          
           assertEquals(1, resultado);
     }

}
