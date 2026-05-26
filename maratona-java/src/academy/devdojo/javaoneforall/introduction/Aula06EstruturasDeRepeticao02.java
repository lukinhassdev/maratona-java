package academy.devdojo.javaoneforall.introduction;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // Imprimindo todos os números pares de 0 até 1000000
        for (int i = 1; i <= 1000000; i+=2) {
            if (i % 2 == 0) {
                System.out.println("PAR");
            }
            else {
                System.out.println("ÌMPAR");
            }
            System.out.println(i);
        }
    }
}