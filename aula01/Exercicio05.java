

/* 
Escreva um programa que leia vários números inteiros digitados pelo usuário, até que o usuário digite zero. O zero termina o programa e exibe a soma de todos os valores digitados. 
*/

import java.util.Scanner;
public class Exercicio05 {
     
     public static void main(String[] args) {
          
          Scanner teclado = new  Scanner(System.in);

          int numero, soma;

          numero = 1;
          soma = 0;
          while(numero != 0){

               System.out.println("Digite um número inteiro: ");
               numero = teclado.nextInt();
               soma = soma + numero;

          }
          System.out.println("Soma = " + soma);

          teclado.close();
     }      
}

/* 

int soma = 0, numeroAtual;

		do {
			System.out.println("digite um número");
			numeroAtual = teclado.nextInt();
			soma += numeroAtual;
		} while (numeroAtual != 0);
		System.out.println("a soma total dos números digitados é " + soma);


*/