import java.util.Scanner;

public class Teste02 {
Scanner userInputScanner=new Scanner(System.in);
public void executar (){
    System.out.println ("Qual seu nome?");
    String userInputName = userInputScanner.nextLine();
    System.out.println("Olá " + userInputName + "!");
}
public static void main (String [] args){
   Teste02 teste02 = new Teste02();
   teste02.executar ();
}
}
    
