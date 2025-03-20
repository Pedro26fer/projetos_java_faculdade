import java.util.Scanner;

public class Lista03Programa02 {
    public static void main(String[] args){
        int num, resto;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um numro: ");
        num = entrada.nextInt();
        resto = num % 2;
        if(resto > 0){
            System.out.println("O numero é impar");
            System.exit(0);
        }
        System.out.println("O numero é par");
        entrada.close();
    }    
}
