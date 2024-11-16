import java.util.Scanner;

//Menu da Calculadora
public class Menu {
    public int menu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma opção");
        System.out.println("|||||||||||||||||||||||");
        System.out.println("||||||||1º Soma||||||||");
        System.out.println("||||||2º Subtração|||||");
        System.out.println("|||3º Multiplicação||||");
        System.out.println("||||||4º Divisão|||||||");
        System.out.println("|||||||||||||||||||||||");

        System.out.println("Insira a sua escolha");

        return scanner.nextInt();
    }
}