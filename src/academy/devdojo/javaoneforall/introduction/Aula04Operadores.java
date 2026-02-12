package academy.devdojo.javaoneforall.introduction;

public class Aula04Operadores {
    public static void main(String []args) {
        System.out.println("--------------------------------");
        System.out.println("TESTANDO OPERADORES ARITIMÉTICOS");
        System.out.println("--------------------------------");
        System.out.println();
        int a = 15;
        int b = 5;
        int resultadoSoma = a + b;
        System.out.println("--------------------------------");
        System.out.println("VALOR DE SOMA");
        System.out.println("--------------------------------");
        System.out.println();
        System.out.println("o valor de a é :"+ a);
        System.out.println("o valor de b é :"+ b);
        System.out.println("a soma de a + b :"+ resultadoSoma);
        //Quando trablhamos com números onde realizamos uma conta que retorna um resultado com casas decimais o correto é trabalhar com variáveis do tipo double ou float, porque se o tipo da variável for inteiro ele retorna um valor inteiro

        System.out.println("--------------------------------");
        System.out.println("VALOR DIVISÃO");
        System.out.println("--------------------------------");
        System.out.println();
        double numero01 = 10;
        double numero02 = 3;
        double resultadoConta = numero01 / numero02;
        System.out.println("o valor de numero01 é :"+ numero01);
        System.out.println("o valor de numero02 é :"+ numero02);
        System.out.println("veja o resultado do numero01 dividido pelo numero02 :"+resultadoConta);
        //Nesse segundo caso abaixo, o valor do resultado dessa divisão vai retornar um número inteiro: 3

        System.out.println("--------------------------------");
        System.out.println("VALOR DIVISÃO");
        System.out.println("--------------------------------");
        System.out.println();
        int x = 10;
        int y = 3;
        int resultadoDivisao = x / y;
        System.out.println("o valor de x:"+ x);
        System.out.println("o valor de y:"+ y);
        System.out.println("resultado da divisão:"+ resultadoDivisao);
        System.out.println();
        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezDifenteDez = 10 != 10;

        //Nesse caso abaixo retornará um true (Verdadeiro) por que estamos comparando números, se compararmos a uma string irá acontecer um erro de compilação.
        boolean isDezIgualDez = 10 == 10.0;
        System.out.println("isDezMaiorQueVinte :" + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte :" + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte :" + isDezIgualVinte);
        System.out.println("isDezDifenteDez :" + isDezDifenteDez);
        System.out.println("isDezIgualDez :" + isDezIgualDez);
    }
}