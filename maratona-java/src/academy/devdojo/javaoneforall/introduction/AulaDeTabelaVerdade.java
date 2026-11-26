package academy.devdojo.javaoneforall.introduction;

public class AulaDeTabelaVerdade {
    public static void main(String[] args) {

        System.out.println("OPERADOR AND (&&)");
        System.out.println("true  && true  = " + (true && true));
        System.out.println("true  && false = " + (true && false));
        System.out.println("false && true  = " + (false && true));
        System.out.println("false && false = " + (false && false));
        System.out.println();

        System.out.println("OPERADOR OR (||)");
        System.out.println("true  || true  = " + (true || true));
        System.out.println("true  || false = " + (true || false));
        System.out.println("false || true  = " + (false || true));
        System.out.println("false || false = " + (false || false));
        System.out.println();

        System.out.println("OPERADOR NOT (!)");
        System.out.println("!true  = " + (!true));
        System.out.println("!false = " + (!false));
        System.out.println("\n==================================================");

        System.out.println("APLICAÇÃO EM SISTEMA DE CRÉDITO");
        boolean temRendaMinima = true;
        boolean temNomeLimpo = false;
        boolean possuiGarantia = true;

        boolean creditoAprovado = (temRendaMinima && temNomeLimpo) || possuiGarantia;

        System.out.println("Variáveis do Cliente:");
        System.out.println(" > Renda Mínima: " + temRendaMinima);
        System.out.println(" > Nome Limpo: " + temNomeLimpo);
        System.out.println(" > Possui Garantia: " + possuiGarantia);
        System.out.println("Resultado da Expressão ((true && false) || true):");
        System.out.println(" >> Crédito Aprovado? " + creditoAprovado);
    }
}