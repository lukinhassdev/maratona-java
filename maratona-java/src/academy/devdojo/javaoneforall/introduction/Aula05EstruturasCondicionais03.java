package academy.devdojo.javaoneforall.introduction;

import java.util.Scanner;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        float salario = leia.nextFloat();
        String mensagemDoar = "CONSEGUE DOAR";
        String mensagemNaoDoar = "SINTO MUITO, VC NÃO TEM CONDICÕES PARA PROSSEGUIR COM A SUA DOAÇÃO!";
        String resultado = salario > 2500 ? mensagemDoar : mensagemNaoDoar;

        System.out.println("DIGITE SEU SALÁRIO E VAMOS DIZER SE TEM CONDICÕES PARA FAZER UMA DOAÇÃO :");
        System.out.println(resultado);
    }
}