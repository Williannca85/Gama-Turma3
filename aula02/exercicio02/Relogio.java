/* 
Escreva a classe Relógio, com os atributos hora, minuto e segundo, e com um construtor que recebe horas, minutos e segundos para inicializar o relógio.
Faça um método da classe para exibir a hora atual. Crie os getters e setters para os atributos.
Faça um programa (main) que crie um objeto do tipo Relógio e exiba a hora atual do relógio.
O relógio não pode aceitar valores inválidos, ou seja, a hora deve estar entre 0 e 23, o minuto e o segundo devem estar entre 0 e 59.
 */

public class Relogio {
  
     private int hora, minuto, segundo;


     public Relogio(int hora, int minuto, int segundo) {
          setHora(hora);
          setMinuto(minuto);
          setSegundo(segundo);
     }

     public void setHora(int novaHora){

     if(novaHora >= 0 && novaHora < 24){
          hora = novaHora;
     }
}

     public void setMinuto(int novoMinuto){

     if(novoMinuto >= 0 && novoMinuto < 60){
          minuto = novoMinuto;
     }
}

     public void setSegundo(int novoSegundo) {
     if(novoSegundo >= 0 && novoSegundo < 60){
          segundo = novoSegundo;
     }
   }

     public int getHora() {
     return hora;
     }    

     public int getMinuto() {
     return minuto;
     }

     public int getSegundo() {
     return segundo;
     }

     public String getHoraAtual(){
     return hora + ":" + minuto + ":" + segundo;
     }
}

/*  public void setHora(int hora, int minuto,int segundo){
    //Aqui pego os valores absolutos, para evitar valores negativos
    hora = java.lang.Math.abs(hora);
    minuto = java.lang.Math.abs(minuto);
    segundo = java.lang.Math.abs(segundo);
    
    if (segundo < 60 && minuto < 60 && hora < 24){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }else{
        //Aqui voce deveria lancar uma exception,
        //mas vamos apenas informar um erro via println
        System.out.println("Dados invalidos.");
    }

}
public String getHora(){
    return this.hora + ":" + this.minuto + ":" + segundo;
}
public void showHora(){
     System.out.println(this.getHora());
}
public void pulso(){
    segundo++;
    if (segundo > 59){
        segundo = 0;
        minuto++;
    }
    if (minuto > 59){
        minuto = 0;
        hora++;
    }
    if (hora > 23){
        hora = 0;
    } */