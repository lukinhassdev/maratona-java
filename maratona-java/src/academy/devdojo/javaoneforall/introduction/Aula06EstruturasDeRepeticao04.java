package academy.devdojo.javaoneforall.introduction;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        // dado o valor de um produto, descubra em até quantas vezes ele pode ser parcelado
        // condição: o valor da parcela tem que ser >= 1000 !
        float ValorBrutoDoProduto = 30000;
        for (int parcelas = 1; parcelas <= ValorBrutoDoProduto ; parcelas++) {
            float ValorParcela = ValorBrutoDoProduto / parcelas;
            if (ValorParcela < 1000) {
                break;
            }
            System.out.println("Valor da parcela a pagar: "+ ValorParcela +" , Quantidade de parcelas :"+ parcelas);
        }
    }
}