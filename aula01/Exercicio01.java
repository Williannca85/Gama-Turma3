import java.util.Scanner;

public class Exercicio01{

     public static void main(String[] args) {

          Scanner teclado = new Scanner(System.in); //Entrada padrão conectado
          double nota1, nota2, media;

          System.out.println("Digite a primeira nota: ");
          nota1 = teclado.nextDouble();

          System.out.println("Digite a segunda nota: ");
          nota2 = teclado.nextDouble();

          media = (nota1 + nota2) / 2;

          System.out.println("A média é: " + media);

          teclado.close();//Desconecta

          
     }
     
}


/* 
Scanner entrada = new Scanner(System.in); //Entrada padrão conectado
double nota1, nota2, media;

System.out.println("Digite a primeira nota: ");
nota1 = entrada.nextDouble();

System.out.println("Digite a segunda nota: ");
nota2 = entrada.nextDouble();

media = (nota1 + nota2) / 2;

System.out.println("A média é: " + media);

entrada.close();//Desconecta
*/