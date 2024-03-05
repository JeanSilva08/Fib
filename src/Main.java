import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
        int num = scanner.nextInt();
        scanner.close();


        boolean pertence = pertenceSequenciaFibonacci(num);

        if (pertence) {
            System.out.println("O número " + num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + num + " não pertence à sequência de Fibonacci.");
        }
    }


    public static boolean pertenceSequenciaFibonacci(int num) {
        int a = 0;
        int b = 1;

        while (a <= num) {
            if (a == num) {
                return true;
            }
            int temp = b;
            b = a + b;
            a = temp;
        }

        return false;
    }
}