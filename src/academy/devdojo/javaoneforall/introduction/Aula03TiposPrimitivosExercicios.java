package academy.devdojo.javaoneforall.introduction;

public class Aula03TiposPrimitivosExercicios {
    public static void main(String []args) {
        String nome = "Lucas";
        String endereco = "Rua galileu das frutas";
        double valorDeSalario = 2000;
        String dataDeRecebimentoSalario = "02/06/2026";

        //Eu utilizei a concatenação de Strings para criar um template de relatório. Em vez de imprimir valores soltos, eu mesclei textos fixos com variáveis para que o resultado final no terminal seja uma frase completa, organizada e de fácil leitura para o usuário.
        String relatorio = "Eu me chamo "+ nome + " estou morando no endereço :"+ endereco + " e recebo meu salário de :"+ valorDeSalario + " reais nos dias :"+ dataDeRecebimentoSalario + " de todo o mês";
        System.out.println(relatorio);
    }
}