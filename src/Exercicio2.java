import java.util.Scanner;

public class Exercicio2 {
   // public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual seu nome: ");
        System.out.println(dizerIformacao(entrada.next()));
        System.out.println("--------------------------------------------");

        System.out.println("Qual sua idade: ");
        System.out.println(dizerIformacao(entrada.nextInt()));
        System.out.println("--------------------------------------------");

        System.out.println("Qual seu peso e altura: ");
        System.out.println(dizerIformacao(entrada.nextDouble(), entrada.nextDouble()));


    }

    public static String dizerIformacao(String nome) {

        return "Meu nome é "+nome;
    }
    public static String dizerIformacao(int idade) {

        return "Minha idade é "+idade;
    }
    public static String dizerIformacao(double peso, double altura) {

        return "Meu peso é " + peso + " e minha altura é " + altura;
    }
}
