package exercicios;

public class ExercicioDeFor02ImprimindoNumerosPares {
    public static void main(String[] args) {
        // Imprimindo todos os números pares de 0 ate 1000000

        for (int i = 0; i <= 1000000; i++) {
            if (i % 2 == 0) {
                System.out.println("Mostrando valores pares "+i);
            } else {
                System.out.println("Mostrando valores impares "+i);
            }
        }
    }
}