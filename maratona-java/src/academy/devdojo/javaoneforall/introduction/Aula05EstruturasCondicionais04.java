package academy.devdojo.javaoneforall.introduction;

import java.util.Scanner;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("DIGITE QUAL O VALOR DO SEU SALÁRIO ANUAL:");
        double salarioAnual = ler.nextDouble();
        double valorImposto;
        if (salarioAnual <= 1412) {
            valorImposto = salarioAnual * (7.5 / 100);
        } else if (salarioAnual <= 2666.98) {
            valorImposto = salarioAnual * (9.0 / 100);
        } else if (salarioAnual <= 4000.03) {
            valorImposto = salarioAnual * (12.0 / 100);
        } else {
            valorImposto = salarioAnual * (14.0 / 100);
        }
        System.out.println("O valor do imposto a ser pago é: R$ " + valorImposto);
    }
}