package exercicios;

import java.util.Scanner;

public class Exercicio01OperadoresAritimeticos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 10;
        int num2 = 20;
        int resultadoDeSoma = num1 + num2;
        System.out.println(resultadoDeSoma);

        System.out.println("Digite a sua primeira nota");
        int nota1 = scanner.nextInt();
        System.out.println("Digite a sua segunda nota");
        int nota2 = scanner.nextInt();
        double resultadoDasMedias = (double) (nota1 + nota2) / 2d;
        System.out.println(resultadoDasMedias);
    }
}
