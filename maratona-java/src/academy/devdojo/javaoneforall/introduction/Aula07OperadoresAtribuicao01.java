package academy.devdojo.javaoneforall.introduction;

public class Aula07OperadoresAtribuicao01 {
    public static void main(String[] args) {
        // operadores de atribuição +=, -=, *=, /=, %=

        int contador01 = 0;
        contador01 += 1;
        System.out.println("Valor do contador01: "+contador01); // Aqui eu estou dizendo: contador01 = contador01 + 1;

        double bonus = 1800;
        bonus += 1000; // Aqui eu estou dizendo: bonus(1800) = bonus(1800) + 1000; = 2800.0
        bonus -= 1000; // Aqui eu estou dizendo: bonus(2800) = bonus(2800) - 1000; = 1800.0
        bonus *= 2;    // Aqui eu estou dizendo: bonus(1800) = bonus(1800) * 2; = 3600.0
        bonus /= 2;    // Aqui eu estou dizendo: bonus(3600) = bonus(3600) / 2; = 1800.0
        bonus %= 2;    // Aqui eu estou dizendo: bonus(1800) = bonus(1800) % 2; = 0.0
        System.out.println("`Valor do bônus: "+bonus);

        // Operadores unários EX: contador02++ e ++contador02;
        // Quando o operador vem na frente da variável "++contador02" soma +1 direto na memória, o valor antigo é apagado e o novo valor é salvo, lê o novo valor da memória pra usar na impressão.
        // Quando o operador vem depois da variável "contador02++" lê o valor atual da memória, o valor é guardado esse valor antigo na tela, soma +1 e atualiza a memória com o novo valor.

        int contador02 = 0;
        System.out.println("Valor do contador02: "+contador02++); // Aqui o contador vai imprimir 0 na tela e, somente após a impressão, será incrementado em mais um na memória.
        System.out.println("Valor do contador02: "+ ++contador02); // Aqui o contador vai imprimir 2 na tela, porque já tem 1 guardado dentro da memória.
        System.out.println("Valor do contador02: "+contador02--); // Aqui o contador vai imprimir 2 na tela, após imprimir o próximo número na tela ele vai tirar menos 1 porque está guardado dentro da memória.
        System.out.println("Valor do contador02: "+ --contador02); // Aqui o contador vai imprimir 0 na tela o valor na memória era 1. Como o operador está antes (--), ele subtrai 1 antes de imprimir. Logo, 1 - 1 = 0. Na memória vira 0 e mostra 0 na tela.
    }
}