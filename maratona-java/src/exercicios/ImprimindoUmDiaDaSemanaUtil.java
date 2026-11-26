package exercicios;

public class ImprimindoUmDiaDaSemanaUtil {
    public static void main(String[] args) {
        // Imprima um dia da semana, considerando 1 como domingo e o resto como dia útil utilizando switch case

        byte dia = 3;
        switch (dia) {
            case 1:
            case 7:
                System.out.println("FINAL DE SEMANA");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("DIA ÚTIL");
                break;
            default:
                System.out.println("OPÇÃO INVÁLIDA");
                break;
        }
    }
}