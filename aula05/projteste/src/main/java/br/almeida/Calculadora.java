package br.almeida;

public class Calculadora {

     public double somar (double n1, double n2){
          return n1 + n2;
     }

     public double subtrair (double n1, double n2){
          return n1 - n2;
     }
     
     public double mulltiplica (double n1, double n2){
          return n1 * n2;
     }
     
     public double divide (double n1, double n2){
          if (n2 == 0) {
               return -1;
          }
          return n1 / n2;
     }
     
     public double resto (double n1, double n2){
          return n1 % n2;
     }
     
}
