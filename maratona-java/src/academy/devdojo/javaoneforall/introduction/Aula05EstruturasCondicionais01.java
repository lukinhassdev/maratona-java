package academy.devdojo.javaoneforall.introduction;

public class Aula05EstruturasCondicionais01 {
    public static void main(String []args) {
        System.out.println("APRENDENDO ESTRUTURAS CONDICIONAIS NO JAVA :");
        System.out.println();
        int idade = 15;
        boolean isAutorizadoComprarBebidaAlcolica = idade >= 18;
        if (isAutorizadoComprarBebidaAlcolica) {
            System.out.println("isAutorizadoComprarBebidaAlcolica "+ isAutorizadoComprarBebidaAlcolica);
        }

        if (!isAutorizadoComprarBebidaAlcolica) {
            System.out.println("isAutorizadoComprarBebidaAlcolica "+ isAutorizadoComprarBebidaAlcolica);
        }

        int dinheiroNoBolso = 10;
        int dinheiroNaConta = 5;
        int pastelDeCarneEcocaCola = 15;
        int valorPastelCoca = 15;
        boolean isPossivelComprarPastelEcocaCola = (dinheiroNoBolso + dinheiroNaConta) >= valorPastelCoca;
        if (dinheiroNoBolso == 10) {
            if (dinheiroNaConta == 5) {
                System.out.println("isPossivelComprarPastelEcocaCola"+ isPossivelComprarPastelEcocaCola);
            } else {
                System.out.println("isPossivelComprarPastelEcocaCola"+ isPossivelComprarPastelEcocaCola);
            }
        }
    }
}