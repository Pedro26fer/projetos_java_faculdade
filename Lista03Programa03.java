import java.util.Scanner;

public class Lista03Programa03 {
    public static void main(String[] args){
        int idade;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        idade = input.nextInt();
        if(idade > 18){
            System.out.println("Você é maior de idade");
            System.exit(0);
        }
        System.out.println("Você é menor de idade");

        input.close();
    }
}
