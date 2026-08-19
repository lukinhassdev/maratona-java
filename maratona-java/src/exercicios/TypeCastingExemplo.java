package exercicios;

import java.util.Scanner;

public class TypeCastingExemplo {
    public static void main(String[] args) {
        Scanner lerNotasDaMedia = new Scanner(System.in);

        int valorExemplo1 = 10;
        double valorDoubleExemplo1 = valorExemplo1;
        System.out.println(valorDoubleExemplo1);

        long valorExemplo2 = 10000000000L;
        int valorMaiorExemplo2 = (int) valorExemplo2;
        System.out.println(valorMaiorExemplo2);

        System.out.println("DIGITE A SUA PRIMEIRA NOTA :");
        int nota1 = lerNotasDaMedia.nextInt();

        System.out.println("DIGITE A SUA SEGUNDA NOTA :");
        int nota2 = lerNotasDaMedia.nextInt();

        double calcularMediaFinal = (double) (nota1 + nota2) / 2;
        System.out.println(calcularMediaFinal);
    }
}
