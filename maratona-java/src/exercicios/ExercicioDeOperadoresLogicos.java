package exercicios;

import java.util.Scanner;

public class ExercicioDeOperadoresLogicos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // && (E), || (OU)

        System.out.println("SEJA BEM VINDO AO PROGRAMA DE TESTE DE OPERADORES LÓGICOS, SIGA A INSTRUÇÃO ABAIXO :");
        System.out.println("1-CASO AMBAS AS CONDIÇÕES NÃO FOREM DE ACORDO COM O PADRÃO, RETORNARÁ FALSE !");
        System.out.println("2-CASO AMBOS AS CONDIÇÕES ATENDEREM O QUE O PADRÃO PEDE, RETORNARÁ TRUE !");
        System.out.println("OU SEJA OS 2 TEM QUE SER A MESMA COISA, SE NÃO, FALSE !");
        System.out.println();

        System.out.println("Digite a sua idade e vamos dizer se ela se encaixa no padrão abaixo :");
        int idade = scanner.nextInt();

        System.out.println("Digite o valor do seu salário :");
        float salarioInicial = scanner.nextFloat();

        boolean leiMaiorQueDezoitoAnos = idade > 18 && salarioInicial > 1618;

        System.out.println("REQUISITOS :");
        System.out.println("SALÁRIO > 1618");
        System.out.println("IDADE > +18");
        System.out.println("você disse que tem "+ idade + " anos" + " e vc ganha um salário de "+ salarioInicial + " reais, por isso vai retornar um "+ leiMaiorQueDezoitoAnos);

        System.out.println();

        System.out.println("SEJA BEM VINDO AO SEGUNDO PROGRAMA DE TESTE DE OPERADORES LÓGICOS, SIGA AS INSTRUÇÕES ABAIXO:");
        System.out.println("1-PELO MENOS UM DOS REQUISITOS TEM QUE SER ATENDIDOS PARA RETORNAR TRUE !");
        System.out.println("2-SÓ RETORNARÁ FALSE CASO CONTRÁRIO NENHUM REQUISITO FOR ATENDIDO !");

        System.out.println("Digite (M) para moto e (C) para carro :");
        char letraInicialAutomovel = scanner.next().charAt(0);

        System.out.println("Digite a velocidade do seu "+ letraInicialAutomovel);
        float velocidadeMediaDoAutomovel = scanner.nextFloat();

        boolean requisitosVelocidadeEautomovel = (velocidadeMediaDoAutomovel >= 90.0F) || (letraInicialAutomovel == 'M');
        System.out.println(requisitosVelocidadeEautomovel);

        scanner.close();
    }
}