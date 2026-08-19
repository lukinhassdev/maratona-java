package exercicios;

import java.util.Scanner;

public class Exercicio01CalculandoBaseDeUmTriangulo {
    public static void main(String[] args) {
        Scanner lerValor = new Scanner(System.in);

        float valorDaBase;
        float valorDaAltura;
        float resultadoDaArea;

        System.out.println("=================================");
        System.out.println("CALCULANDO A ÁREA DE UM TRIÂNGULO");
        System.out.println("=================================");

        System.out.print("DIGITE O VALOR DA BASE: ");
        valorDaBase = lerValor.nextFloat();

        System.out.print("DIGITE O VALOR DA ALTURA: ");
        valorDaAltura = lerValor.nextFloat();

        resultadoDaArea = (valorDaBase * valorDaAltura) / 2;

        System.out.println("\n=================================");

        System.out.println("VALOR DA BASE: " + valorDaBase);
        System.out.println("VALOR DA ALTURA: " + valorDaAltura);
        System.out.println("RESULTADO DA ÁREA: " + resultadoDaArea);

        System.out.println("=================================");

        lerValor.close();
    }
}