import java.util.Arrays;
import java.util.Scanner;
public class Lista03Programa04 {
    public static void main(String[] args){
        double num1, num2, num3, maior;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        num1 = input.nextDouble();
        System.out.print("Digite o segundo número: ");
        num2 = input.nextDouble();
        System.out.print("Digite o terceiro número: ");
        num3 = input.nextDouble();

        double[] numeros = {num1,num2,num3};
        Arrays.sort(numeros);
        maior = numeros[numeros.length -1];
        System.out.printf("O maior numero digitado foi %.2f", maior);

        input.close();
    }
}
