import java.util.Scanner;
public class Lista03Programa08 {
    public static void main(String[] args){
        int anos_contribuindo, idade;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite quantos anos você tem de contribuição: ");
        anos_contribuindo = input.nextInt();
        System.out.print("Digite sua idade: ");
        idade = input.nextInt();

        if(idade > 65 || anos_contribuindo >= 30 || (idade >= 60 && anos_contribuindo >= 25)){
            System.out.println("Ufa! Você já pode se aposentar");
        }
        else{
            System.out.println("Sua alma ainda não pode ser liberta");
        }
        input.close();
    }
}
