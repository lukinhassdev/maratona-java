package exercicios;

public class ExercicioDeFor01 {
    public static void main(String[] args) {
        int numeroParOuImpar = 1;

        for (int i = 0; i < 1 ; i++) {
            if (numeroParOuImpar % 2 == 0) {
                System.out.println(numeroParOuImpar + " numero par");
            } else {
                System.out.println(numeroParOuImpar + " numero impar");
            }
        }
    }
}