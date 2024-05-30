import java.util.Scanner;

public class Calculadora {
        Scanner userInputScanner=new Scanner(System.in);
public void executar (){
        System.out.println ("    ======= Calculadora ======     ");
        System.out.println ("__________________________________ ");
        System.out.println ("|       Escolha uma operação      |");
        System.out.println ("| 1 |   ADIÇÃO                    |");
        System.out.println ("| 2 |   SUBTRAÇÃO                 |");
        System.out.println ("| 3 |   MULTIPLICAÇÃO             |");
        System.out.println ("| 4 |   DIVISÃO                   |");
        System.out.println ("| 0 |   SAIR                      |");
        System.out.println ("-----------------------------------");
        
        System.out.println ("Insira o numero da operação que desejar");
        int op = userInputScanner.nextInt();
        int num1;
        int num2;
        int flag = 0;
        
     
        switch (op){
            case 1:
                 System.out.println (" ===== ADIÇÃO ===== ");
                 num1 = userInputScanner.nextInt();
                 System.out.println ("+");
                 num2 = userInputScanner.nextInt();
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2) );
                System.out.println ("A soma é: " + ( num1 + num2)) ;
                break;
            case 2:
                 System.out.println (" ===== SUBTRAÇÃO ===== ");
                 num1 = userInputScanner.nextInt();
                 System.out.println ("-");
                 num2 = userInputScanner.nextInt();
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2) );
                System.out.println ("A subtração é: " + ( num1 - num2)) ;
                break;
            case 3:
                 System.out.println (" ===== MULTIPLICAÇÃO ===== ");
                 num1 = userInputScanner.nextInt();
                 System.out.println ("x");
                 num2 = userInputScanner.nextInt();
                System.out.println(num1 + " x " + num2 + " = " + (num1 * num2) );
                System.out.println ("O produto é: " + ( num1 * num2)) ;
                break;
            case 4:
                 System.out.println (" ==== DIVISÃO ===== ");
                 num1 = userInputScanner.nextInt();
                 System.out.println ("/");
                 num2 = userInputScanner.nextInt();

                System.out.println ("O quociente é: " + ( num1 / num2)) ;
                break;
                
            case 0:
                 System.out.println (" Saindo da calculadora ");
                 break;
   }

}

}