package academy.devdojo.javaoneforall.introduction;

public class Aula08EstruturasCondicionais01If {
    public static void main(String[] args) {
        // Estrutura condicional if (se)

        int idade = 15;
        boolean isAutorizadoAcomprarBebidaAlcolica = idade >=18;
        if (isAutorizadoAcomprarBebidaAlcolica) {
            System.out.println("isAutorizadoAcomprarBebidaAlcolica "+isAutorizadoAcomprarBebidaAlcolica);
        }

        if (!isAutorizadoAcomprarBebidaAlcolica) { // "!" Operador de negação, se a comparação dentro do if for true, vai retornar false
            System.out.println("NaoAutorizadoAcomprarBebidaAlcolica "+isAutorizadoAcomprarBebidaAlcolica);
        }
    }
}