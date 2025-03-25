import java.util.*;

public class Lista03Programa06 {
    public static void main(String[] args){
        double nota1, nota2, nota3, media;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a primeira: ");
        nota1 = input.nextDouble();
        System.out.print("Digite a segunda: ");
        nota2 = input.nextDouble();
        System.out.print("Digite a terceira: ");
        nota3 = input.nextDouble();

        media = (nota1 + nota2 + nota3)/3;

        if(media >= 70){
            System.out.printf("Sua média foi %.2f, você está aprovado", media);
            System.exit(0);
        }
        else if(50 <= media && media <= 69){
            System.out.printf("Sua média foi de %.2f, você está de recuperação", media);
            System.exit(0);
        }
        else{
            System.out.printf("Sua média foi de %.2f, você está REPROVADO", media);
            System.exit(0);
        }

        input.close();
    }
}
