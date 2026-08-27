package exercicios;

public class ExercicioEstruturasCondicionaisElseif02CalculoCategoriaDeBaseIdade {
    public static void main(String[] args) {

        // idade < 15 = categoria infantil
        // idade >= 15 && idade < 18 = categoria juvenil
        // idade > 18 = categoria adulto

        String categoria;
        int idade = 17;

        if (idade < 15) {
            categoria = "categoria infantil";
        } else if (idade >= 15 && idade <18) {
            categoria = "categoria juvenil";
        } else {
            categoria = "categoria adulto";
        }
        System.out.println(categoria);
    }
}