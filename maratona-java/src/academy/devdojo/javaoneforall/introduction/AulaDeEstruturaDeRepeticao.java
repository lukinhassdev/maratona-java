package academy.devdojo.javaoneforall.introduction;

public class AulaDeEstruturaDeRepeticao {
    public static void main(String[] args) {
        // Entendendo mais sobre while, do-while e for

        int count = 0;
        while (count < 10) {
            System.out.println("dentro do while "+ count++);
        }

        System.out.println();

        do {
            System.out.println("dentro do do-while "+ count++);
        } while (count < 10);

        System.out.println();

        for (int i = 1; i < 10; i++) {
            System.out.println("Digite o seu "+ i +" nome ");
        }
    }
}