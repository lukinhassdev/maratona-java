package exercicios;

public class Exercicio02DeOperadoresLogicos02 {
    public static void main(String[] args) {
        // utilizando or (OU) ||

        double valorDaContaCorrente = 200;
        double valorDaContaPoupanca = 10000;
        float valorDoPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorDaContaCorrente > valorDoPlaystation || valorDaContaPoupanca > valorDoPlaystation;
        System.out.println("isPlaystationCincoCompravel "+isPlaystationCincoCompravel);
    }
}