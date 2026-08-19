package exercicios;

public class CalculadoraSupermercadoOperadoresAritimeticos {
    public static void main(String[] args) {
        float precoDoLeite = 5f;
        float precoDoArrozKg = 22f;
        float cupomDeDesconto = 7f;
        float subTotal;
        float totalDesconto;
        float valorDeCadaParcela;
        float restoDaDivisao;

        int quantidadesDeCaixasDeLeite = 3;
        int quantidadesDeParecelas = 3;

        subTotal = quantidadesDeCaixasDeLeite * precoDoLeite + precoDoArrozKg;
        System.out.println("Subtotal da compra :"+ subTotal);

        totalDesconto = subTotal - cupomDeDesconto;
        System.out.println("Total com desconto: "+ totalDesconto);

        valorDeCadaParcela = totalDesconto / quantidadesDeParecelas;
        System.out.println("Valor de cada parcela: "+valorDeCadaParcela);

        restoDaDivisao = totalDesconto % quantidadesDeParecelas;
        System.out.println("Resto da divisão das parcelas: "+ restoDaDivisao);
    }
}
    