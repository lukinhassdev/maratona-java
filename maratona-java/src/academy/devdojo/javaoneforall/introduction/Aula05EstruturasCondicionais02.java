package academy.devdojo.javaoneforall.introduction;

import java.util.Scanner;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        //Esse é um programa que diz a categoria de um atleta de acordo com a sua idade.
        //Importando o scanner para que o usuário digite no terminal.

        Scanner leia = new Scanner(System.in);

        System.out.print("DIGITE A SUA IDADE: ");
        int idade = leia.nextInt();

        if (idade < 7) {
            System.out.println("AINDA NÃO POSSUI CATEGORIA");
        } else if (idade >= 7 && idade <= 10) {
            System.out.println("CATEGORIA INICIAÇÃO");
        } else if (idade >= 11 && idade <= 13) {
            System.out.println("CATEGORIA MIRIM");
        } else if (idade >= 14 && idade <= 15) {
            System.out.println("CATEGORIA INFANTIL");
        } else if (idade >= 16 && idade <= 18) {
            System.out.println("CATEGORIA JUVENIL");
        } else {
            System.out.println("CATEGORIA ADULTO");
        }
    }
}