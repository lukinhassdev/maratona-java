package academy.devdojo.javaoneforall.introduction;

public class Aula02TiposPrimitivos {
    public static void main(String []args) {
        // int, double, byte, short, long, float, boolean, char;
        System.out.println("TIPOS PRIMITIVOS DENTRO DO JAVA :");
        System.out.println("---------------------------------");
        String name = "Lucas";
        String frase = "Eu estou aprendendo java com DevDojo";
        int age = 18;
        long numeroGrande = 100000;
        double salarioDouble = 2000;
        float salarioFloat = 2500;
        boolean verdadeiro = true;
        boolean falso = false;
        short idadeShort = 10;
        byte idadeByte = 127;
        char caractere = 'M';

        System.out.println("Meu nome é :" + name + " e " + frase + ", Minha idade é :" + age + " anos");
        System.out.println(numeroGrande);
        System.out.println(salarioDouble);
        System.out.println(salarioFloat);
        System.out.println(verdadeiro);
        System.out.println(falso);
        System.out.println(idadeShort);
        System.out.println(idadeByte);
        System.out.println(caractere);
    }
}
// Testando o controle do Git