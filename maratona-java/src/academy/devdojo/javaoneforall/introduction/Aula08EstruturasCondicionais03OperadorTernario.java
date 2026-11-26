package academy.devdojo.javaoneforall.introduction;

public class Aula08EstruturasCondicionais03OperadorTernario {
    public static void main(String []args) {
        // introducao ao operador ternario
        // nomeDaVariavel = (condicao) ? true : false

        float mediaSalarial = 2800f;
        String resultado = mediaSalarial > 2500 ? "celular comprável" : "Você ainda tem que ganhar um pouco mais de dinheiro";
        System.out.println(resultado);

        int idade = 16;
        String resultadoCategoriaDeBase = (idade < 14) ? "muito jovem" :
                (idade <= 15) ? "categoria infantil" :
                        (idade <= 17) ? "categoria juvenil" :
                                (idade <= 20) ? "categoria júnior/sub-20" : "categoria adulto";

        System.out.println(resultadoCategoriaDeBase);


        System.out.println(resultadoCategoriaDeBase);

        float dinheiroDeEntradaParaComprarCarro = 35000.00f;
        String resultadoDeCarroCompravel = (dinheiroDeEntradaParaComprarCarro >= 30000) ? "carro compravel" :
                (dinheiroDeEntradaParaComprarCarro >= 10000) ? "precisará financiar o seu carro" :
                        "muito arriscado financiar !";

        System.out.println(resultadoDeCarroCompravel);

    }
}