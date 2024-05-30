import java.util.Scanner;

public class Teste03 {
    private Scanner sc = new Scanner (System.in);
public void executar (){
    System.out.println("Informe um valor: ");
    int valor = sc.nextInt();
    System.out.println("O valor informado foi " + valor);
}
public static void main (String [] args) {
    Teste03 teste03 = new Teste03();
    teste03.executar();
}
}
