import java.util.Scanner;

public class Lista03Programa01 {

    public static void main(String[] argrs){
        double num;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        num = entrada.nextDouble();

        if(num > 10){
            System.out.println("O numero é maior que 10");
            System.exit(0);
        }
        
        System.out.println("O numero é menor que 10");
        entrada.close();

    }
}
