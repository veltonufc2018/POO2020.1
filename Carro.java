import java.util.Scanner;

public class Carro {
    int nPessoas = 0;
    void embarca(final int qtd) {
      this.nPessoas += qtd;
  }

  void show() {
      System.out.println("Passageros = " + this.nPessoas);

  }

public static void main(final String[] args) {
Scanner scanner = new Scanner(System.in);
Carro carro = new Carro(); 
   
   while (true){
     
    String line = scanner.nextLine();
    String iu[] = line.split(" ");
     if ( iu[0].equals("Para")){
          break;
        } 
     else if ( iu[0].equals("Quantos")){
         carro.show();
        }  
     else if ( iu[0].equals("Entrar")){
         int qtd = Integer.parseInt(iu[1]);
          if (qtd <= 4 ){
              carro.embarca(qtd);

           }
           else System.out.println(" Capacidade não permitida ");
        } 
     else {
    System.out.println("Comado não aceito");
        }  
    }
 }


}