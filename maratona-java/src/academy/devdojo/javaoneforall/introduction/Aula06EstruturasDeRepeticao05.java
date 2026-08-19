package academy.devdojo.javaoneforall.introduction;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        // dado o valor de um produto, descubra em até quantas vezes ele pode ser parcelado
        // condição: o valor da parcela tem que ser >= 1000 !
        float ValorBrutoDoProduto = 30000;
        for (int parcelas = (int) ValorBrutoDoProduto; parcelas >= 1; parcelas--) {
            double ValorDaParcela = ValorBrutoDoProduto / parcelas;
            if (ValorDaParcela < 1000) {
                continue;
            }
            System.out.println("Valor da parcela a pagar: "+ ValorDaParcela +" , Quantidade de parcelas :"+ parcelas);
        }
    }
}