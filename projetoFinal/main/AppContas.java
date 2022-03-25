package main;

import java.util.Scanner;

import projetoFinal.Conta;
import projetoFinal.ContaCorrente;
import projetoFinal.ContaEspecial;
import util.GerenciarContas;

public class AppContas {

  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    GerenciarContas contas = new GerenciarContas();
    int opcao = 0;
    int numeroConta;
    double saldo, limite, valorSaque, valorDeposito;
    Conta c;

    while (opcao != 6) {
      System.out.println("--------- Bem Vindo --------------");
      System.out.println("Escolha um dos nossos serviços");
      System.out.println("------------------------------------");
      System.out.println(
        "\n 1 - Nova Conta Corrente \n 2 - Nova Conta Especial \n 3 - Exibir \n 4 - Depositar \n 5 - Sacar \n 6 - Consultar Saldo \n 7 - Sair"
      );
      System.out.println("------------------------------------");
      System.out.print("Informe a opção desejada: ");
      opcao = teclado.nextInt();
      switch (opcao) {

        case 1:
          System.out.println("Informe o número da Conta Corrente:");
          numeroConta = teclado.nextInt();
          System.out.println("Informe o saldo da Conta Corrente:");
          saldo = teclado.nextInt();
          c = new ContaCorrente(numeroConta, saldo);
          contas.adicionar(c);
          break;

        case 2:
          System.out.println("Informe o número da Conta Especial: ");
          numeroConta = teclado.nextInt();
          System.out.println("Digite o saldo da Conta Especial: ");
          saldo = teclado.nextDouble();
          System.out.println("Informe o valor do limite Conta Especial:");
          limite = teclado.nextDouble();
          c = new ContaEspecial(numeroConta, saldo, limite);
          contas.adicionar(c);
          break;

        case 3:
          System.out.println("Digite o número da conta para procurar");
          numeroConta = teclado.nextInt();
          System.out.println(contas.exibir(numeroConta));
          break;

        case 4:
          System.out.println("Informe o número da conta:");
          numeroConta = teclado.nextInt();
          System.out.println("Digite o valor a ser depositado:");  
          valorDeposito = teclado.nextDouble();
          contas.depositar(numeroConta, valorDeposito);
          break;

        case 5:
          System.out.println("Informe o número da conta:");
          numeroConta = teclado.nextInt();
          System.out.println("Informe o valor a Sacar:");
          valorSaque = teclado.nextDouble();
          contas.sacar(numeroConta, valorSaque);
          break;

        case 6:
          System.out.println("Informe o número da conta:");
          numeroConta = teclado.nextInt();
          System.out.println("Qual o valor deseja sacar:");
          valorSaque = teclado.nextDouble();
          System.out.println(contas.sacar(numeroConta,valorSaque));
          break;

        case 7:
        System.out.println("Fim do programa.");
          break;
        default:
          System.out.println("Operação inválida!");
          break;
      }
    }

    teclado.close();
  }
}

