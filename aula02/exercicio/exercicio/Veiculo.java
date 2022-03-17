
/* 
Crie a classe veículo, com os atributos modelo, marca e consumo (quantos km/l).
Faça um construtor para inicializar os atributos da classe.
Escreva um método para mostrar na tela os dados do carro (modelo, marca) e outro método para retornar o valor do consumo.
Faça um arquivo com o método main para testar a classe criada, ou seja, criar um objeto e exibir os dados.

modelo
marca
consumo

*/

package exercicio;

public class Veiculo {

    private String marca, modelo;
    private double consumo;

     public Veiculo(String marca, String modelo, double consumo) {

          this.marca = marca;
          this.modelo = modelo;
          this.consumo = consumo;
     }

     public String getMarca() {
          return this.marca;
     }

     public void setMarca(String marca) {
          this.marca = marca;
     }

     public String getModelo() {
          return this.modelo;
     }

     public void setModelo(String modelo) {
          this.modelo = modelo;
     }

     public double getConsumo() {
          return this.consumo;
     }

     public void setConsumo(double novoConsumo) {
          this.consumo = novoConsumo;
     }



     public void mostrar(){

          System.out.println("Marca = " + marca + " Modelo = " + modelo + " Consumo = " + consumo);

     }


}   

