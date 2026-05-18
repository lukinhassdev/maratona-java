package academy.devdojo.javaoneforall.introduction;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        // Conhecendo o switch-case

        //Switch não suporta valores dedimais, valores float e double não funcionam nessa estrutura.
        //Switch suporta: byte, char, int, enum, short, String.
        byte dia = 5;
        switch (dia) {
            case 1:
                System.out.println("DOM");
                break;
            case 2:
                System.out.println("SEG");
                break;
            case 3:
                System.out.println("TER");
                break;
            case 4:
                System.out.println("QUA");
                break;
            case 5:
                System.out.println("QUI");
                break;
            case 6:
                System.out.println("SEX");
                break;
            case 7:
                System.out.println("SÁB");
                break;
            default:
                System.out.println("Opção inválida");
        }
        char sexo = 'M';
        switch (sexo) {
            case 1:
                System.out.println("MASCULINO");
                break;
            case 2:
                System.out.println("FEMININO");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
