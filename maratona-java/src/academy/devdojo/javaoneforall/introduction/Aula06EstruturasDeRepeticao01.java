package academy.devdojo.javaoneforall.introduction;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for

        // 1-while, é uma estrutura "enquanto", primeiro que a comparação que vc tem que fazer dentro do parênteses precisa ser boleano
        // 2-Se a condição dentro do parêntese for falsa, while não vai nem rodar

        int contador = 0;
        while (contador < 10) {
            contador += 1;
            System.out.println(contador);
        }

        // 1-do-while ele vai executar pelo menos há uma vez dentro do código mesmo se a estrutura for falsa

        contador = 0;
        do {
            System.out.println("Dentro do do-while "+ ++contador);
        } while (contador < 10);

        // 1-Não necessáriamente precisa declarar a variável precisa ser declarada dentro do for como no exemplo abaixo
        // 2-Porém precisa associar o valor da variável !

        for (int i=0; i < 10; i++) {
            System.out.println("for "+i);
        }
    }
}