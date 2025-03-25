import java.util.Scanner;

public class Lista03Programa07 {
    public static void main(String[] arg){
        double lado1, lado2, lado3;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro lado: ");
        lado1 = input.nextDouble();
        System.out.print("Digite o segundo lado: ");
        lado2 = input.nextDouble();
        System.out.print("Digite o terceiro lado: ");
        lado3 = input.nextDouble();

        if(lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2){
            System.out.print("O seu triângulo é válido");
            System.exit(0);
        }

        System.out.println("O seu triângulo não é válido");

        input.close();
    }
}
