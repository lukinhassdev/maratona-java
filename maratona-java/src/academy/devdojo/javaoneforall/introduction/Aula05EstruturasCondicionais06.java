package academy.devdojo.javaoneforall.introduction;

import java.util.Scanner;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Dado os valores 1 e 7, imprima os valores do dia da semana, se for sábado ou domingo será considerado final de semana, caso o contrário será dia últil
        // utilizando a estrutura switch nesse exercício
        Scanner lerDia = new Scanner(System.in);
        System.out.println("DIGITE UM NÚMERO DO DIA DA SEMANA E O PROGRAMA VAI IMPRIMIR SE É DIA ÚLTI OU FINAL DE SEMANA");
        byte dia = lerDia.nextByte();
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
                System.out.println("VALOR DIGITADO INVÁLIDO, TENTE NOVAMENTE COM VALORES DE 1-7.");
        }
    }
}