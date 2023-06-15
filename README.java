- 👋 Hi, I’m @barbaraspa
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int choice;

        do {

            System.out.println("=== Menu ===");

            System.out.println("1. Calcular fatorial");

            System.out.println("0. Sair");

            System.out.print("Escolha uma opção: ");

            choice = scanner.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Digite um número inteiro não negativo: ");

                    int number = scanner.nextInt();

                    if (number < 0) {

                        System.out.println("Número inválido! O fatorial não pode ser calculado para números negativos.");

                    } else {

                        long factorial = calculateFactorial(number);

                        System.out.println("O fatorial de " + number + " é: " + factorial);

                    }

                    break;

                case 0:

                    System.out.println("Encerrando o programa...");

                    break;

                default:

                    System.out.println("Opção inválida! Digite um número válido do menu.");

            }

            System.out.println();

        } while (choice != 0);

        scanner.close();

    }

    private static long calculateFactorial(int number) {

        if (number == 0 || number == 1) {

            return 1;

        }

        long factorial = 1;

        for (int i = 2; i <= number; i++) {

            factorial *= i;

        }

        return factorial;

    }

}
