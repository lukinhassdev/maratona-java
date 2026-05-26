package academy.devdojo.javaoneforall.introduction;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        // imprima os primeiros 25 valores dado a um valor. Por exemplo, 50

        int ValorMax = 50;
        for (int i = 0 ; i <= ValorMax ; i++) {
            if (i > 25) {
                break;
            }
            System.out.println(i);
        } // Fim do for.
          // 1-Toda vez que for testar um valor onde e deseja que ele não ultrapasse o limite MAX
          // 2-utilize um break, mas o "break" PRECISA estar dentro do seu laço de repetição ou "switch" ! caso contrário vai quebrar.
    }
}