import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entradaNota = new Scanner(System.in);

        System.out.println("Informe a nota: ");
        double nota = entradaNota.nextDouble();

        System.out.println("Você está com: "+classificarNota(nota));

        
    }
    public static char classificarNota(double nota){
        char a = 0;

        if (nota>=9){
             a = 'A';
        }
        else if (nota>=8 && nota<9){
             a = 'B';
        }
        else if (nota>=7 && nota<8){
             a = 'C';
        }
        if (nota>=6 && nota<7){
             a = 'D';
        }
        else if (nota<6){
             a='E';
        }
        return a;
    }

}