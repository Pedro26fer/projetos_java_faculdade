import java.util.Scanner;

public class Lista03Programa05 {
    public static void main(String[] args){
        int anos_trabalho, nota_desempenho;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite os anos de trabalho: ");
        anos_trabalho = input.nextInt();
        System.out.print("Digite a nota de desempenho de 1 a 100: ");
        nota_desempenho = input.nextInt();

        if(anos_trabalho > 5 || nota_desempenho > 90){
            System.out.println("Você tem direito ao bonus");
            System.exit(0);
        }

        System.out.println("Você não tem direito ao bonus");

        input.close();
    }

}
