package exercicios;

import java.util.Scanner;

public class ExercicioEstruturaSwitch {
    public static void main(String []args) {
        // o usuário escolhe que tipo de conta ele quer fazer, somar, subtrair, dividir, multiplicar, resto da divisão;

        Scanner scanner = new Scanner(System.in);

        int numberOne = 10;
        int numberTwo = 15;
        int resultadoDaContaFeita;

        System.out.println("SEJA BEM VINDO, VEJA AS INFORMAÇÕES ABAIXO :");
        System.out.println("DIGITE 1 PARA SOMAR OS VALORES");
        System.out.println("DIGITE 2 PARA SUBTRAIR OS VALORES");
        System.out.println("DIGITE 3 PARA DIVIDIR OS VALORES");
        System.out.println("DIGITE 4 PARA MULTIPLICAR OS VALORES");
        System.out.println("DIGITE 5 PARA VER O RESTO DA DIVISÃO DOS VALORES");

        int numeroDigitado = scanner.nextInt();

        switch (numeroDigitado = scanner.nextInt()) {
            case 1:
                System.out.println("MÉTODO DE SOMA SELECIONADO");
                resultadoDaContaFeita = numberOne + numberTwo;
                System.out.println(resultadoDaContaFeita);
                break;
            case 2:
                System.out.println("MÉTODO DE SUBTRAÇÃO SELECIONADO");
                resultadoDaContaFeita = numberOne - numberTwo;
                System.out.println(resultadoDaContaFeita);
                break;
            case 3:
                System.out.println("MÉTODO DE DIVISÃO SELECIONADO");
                resultadoDaContaFeita = numberOne / numberTwo;
                System.out.println(resultadoDaContaFeita);
                break;
            case 4:
                System.out.println("MÉTODO DE MULTIPLICAR SELECIONADO");
                resultadoDaContaFeita = numberOne * numberTwo;
                System.out.println(resultadoDaContaFeita);
                break;
            case 5:
                System.out.println("MÉTODO DE RESTO DE DIVISÃO SELECIONADO");
                resultadoDaContaFeita = numberOne % numberTwo;
                System.out.println(resultadoDaContaFeita);
                break;
            default:
                System.out.println("OPÇÃO INVÁLIDA, DIGITE NOVAMENTE.");
                break;
        }
        scanner.close();
    }
}
