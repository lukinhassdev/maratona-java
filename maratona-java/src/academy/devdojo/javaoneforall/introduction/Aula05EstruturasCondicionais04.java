package academy.devdojo.javaoneforall.introduction;

import java.util.Scanner;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double primeiraFaixa = 7.5 / 100;
        double segundaFaixa = 9.0 / 100;
        double terceiraFaixa = 12.0 / 100;
        double quartaFaixa = 14.0 / 100;
        double valorImposto;

        System.out.println("DIGITE QUAL O VALOR DO SEU SALÁRIO ANUAL:");
        double salarioAnual = ler.nextDouble();
        if (salarioAnual <= 1412) {
            valorImposto = salarioAnual * primeiraFaixa;
        } else if (salarioAnual <= 2666.98) {
            valorImposto = salarioAnual * segundaFaixa;
        } else if (salarioAnual <= 4000.03) {
            valorImposto = salarioAnual * terceiraFaixa;
        } else {
            valorImposto = salarioAnual * quartaFaixa;
        }
        System.out.println("O valor do imposto a ser pago é: R$ " + valorImposto);
    }
}