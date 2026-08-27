package academy.devdojo.javaoneforall.introduction;

public class Aula08EstruturasCondicionais02Else {
    public static void main(String[] args) {
        // Estrutura condicional else (senao)

        int idadeMinimaPraTirarCarteiraDeHabilitacao = 18;
        boolean isAutorizadoTirarCarteiraDeHabilitacao = idadeMinimaPraTirarCarteiraDeHabilitacao >= 18;

        if (idadeMinimaPraTirarCarteiraDeHabilitacao >= 18) {
            System.out.println("isAutorizadoTirarCarteiraDeHabilitacao "+isAutorizadoTirarCarteiraDeHabilitacao);
        } else {
            System.out.println("NaoAutorizadoTirarCarteiraDeHabilitacao "+isAutorizadoTirarCarteiraDeHabilitacao);
        }
    }
}