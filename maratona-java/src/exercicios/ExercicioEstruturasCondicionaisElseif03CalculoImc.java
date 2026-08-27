package exercicios;

import java.util.Scanner;

public class ExercicioEstruturasCondicionaisElseif03CalculoImc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o seu peso em kg :");
        float peso = scanner.nextFloat();

        System.out.println("digite a sua altura em metros :");
        float altura = scanner.nextFloat();

        float imc;

        imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("STATUS :abaixo do peso, IMC -> "+imc);
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("STATUS: peso normal, IMC -> "+imc);
        } else if (imc >= 25.0 && imc < 29.9) {
            System.out.println("STATUS: sobrepeso (pré-obesidade) , IMC -> "+imc);
        } else if (imc >= 30.0 && imc < 34.9) {
            System.out.println("STATUS: Obesidade Grau I, IMC -> "+imc);
        } else if (imc >= 35.0 && imc < 39.9) {
            System.out.println("STATUS: Obesidade Grau II, IMC -> "+imc);
        } else {
            System.out.println("STATUS: Obesidade Grave , IMC -> "+imc);
        }
    }
}