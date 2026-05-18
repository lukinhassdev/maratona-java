package exercicios;

import java.util.Scanner;

public class exercicio02TrabalhandoAestruturaSwitch {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("ESTOQUE DE PRODUTOS");
        System.out.println("===================================");
        System.out.println();
        System.out.println("ESCOLHA O LOCAL DE ESTOQUE :");
        System.out.println();
        System.out.println("DIGITE 1 PARA LOCAL GELADO | DIGITE 2 PARA LOCAL SECO");
        int ambienteDeEstoque = leitor.nextInt();

        switch (ambienteDeEstoque) {
            case 1:
                System.out.println("LOCAL GELADO - DIGITE A OPÇÃO DESEJADA :");
                System.out.println("1- APRESUNTADOS");
                System.out.println("2- BACOS E DEFUMADOS");
                System.out.println("3- MORTADELAS");
                System.out.println("4- PRESUNTOS");
                System.out.println("5- QUEIJOS | MUSSARELAS");
                System.out.println("6- BANHAS | GORDURAS");
                System.out.println("7- CALAB-BOVINA");
                System.out.println("8- DANONE");
                int produtosEstoqueGelado = leitor.nextInt();

                switch (produtosEstoqueGelado) {
                    case 1:
                        System.out.println("APRESUNTADOS");
                        System.out.println("1- FRIMESA");
                        System.out.println("2- NOBRE E PEPPERI");
                        System.out.println("3- PERDIGÃO");
                        int produtosApresQuantidade = leitor.nextInt();
                        switch (produtosApresQuantidade) {
                            case 1:
                                System.out.println("APRES-FRIMESA CX 2PC 3,25KG");
                                System.out.println("QUANTIDADE: 1.346,57 KG");
                                System.out.println("END-RUA : A, PALLET : 8");
                                break;
                            case 2:
                                System.out.println("APRES-NOBRE-PEPPERI CX 2PC 3,75KG");
                                System.out.println("QUANTIDADE: 1.016,52 KG");
                                System.out.println("END-RUA : A, PALLET : 7");
                                break;
                            case 3:
                                System.out.println("APRES-PERDIGÃO CX 2PC 3,50KG");
                                System.out.println("QUANTIDADE: 2.016,52 KG");
                                System.out.println("END-RUA : A, PALLET : 6");
                                break;
                            default:
                                System.out.println("OPÇÃO INVÁLIDA");
                        }
                        break;
                    case 2:
                        System.out.println("BACOS E DEFUMADOS");
                        System.out.println("1- TONELI");
                        System.out.println("2- BASSO");
                        System.out.println("3- MR-BEEF");
                        int produtosBaconQuantidade = leitor.nextInt();
                        switch (produtosBaconQuantidade) {
                            case 1:
                                System.out.println("BACON TONELI FAT PT 2KG");
                                System.out.println("QUANTIDADE: 946,57 KG");
                                System.out.println("END-RUA : B, PALLET : 2");
                                break;
                            case 2:
                                System.out.println("BACON BASSO CUBOS PT 1,5KG");
                                System.out.println("QUANTIDADE: 816,23 KG");
                                System.out.println("END-RUA : B, PALLET : 4");
                                break;
                            case 3:
                                System.out.println("BACON MR BEEF TIRAS PT 1KG");
                                System.out.println("QUANTIDADE: 1.146,57 KG");
                                System.out.println("END-RUA : B, PALLET : 5");
                                break;
                            default:
                                System.out.println("OPÇÃO INVÁLIDA");
                        }
                        break;
                    case 3:
                        System.out.println("MORTADELAS");
                        System.out.println("1- MARBA TRADICIONAL");
                        System.out.println("2- MARBA ITALIANA");
                        System.out.println("3- MARBA ROYAL");
                        System.out.println("4- MARBA OURO PERDIGÃO");
                        System.out.println("5- MARBA DEFUMADA");
                        int produtosMortadelasQuantidade = leitor.nextInt();
                        switch (produtosMortadelasQuantidade) {
                            case 1:
                                System.out.println("MARBA TRADICIONAL CX4 5KG");
                                System.out.println("QUANTIDADE: 3.432,56 KG");
                                System.out.println("END-RUA : C, PALLET : 1");
                                break;
                            case 2:
                                System.out.println("MARBA ITALIANA CX2 5KG");
                                System.out.println("QUANTIDADE: 3.012,56 KG");
                                System.out.println("END-RUA : C, PALLET : 2");
                                break;
                            case 3:
                                System.out.println("MARBA ROYAL DEF CX2 4,75KG");
                                System.out.println("QUANTIDADE: 2.232,56 KG");
                                System.out.println("END-RUA : C, PALLET : 3");
                                break;
                            case 4:
                                System.out.println("MARBA OURO PERDIGÃO CX2 4,5KG");
                                System.out.println("QUANTIDADE: 3.422,56 KG");
                                System.out.println("END-RUA : C, PALLET : 4");
                                break;
                            case 5:
                                System.out.println("MARBA DEFUMADA CX2 4,75KG");
                                System.out.println("QUANTIDADE: 1.432,56 KG");
                                System.out.println("END-RUA : C, PALLET : 5");
                                break;
                            default:
                                System.out.println("OPÇÃO INVÁLIDA");
                        }
                        break;
                    case 4:
                        System.out.println("PRESUNTOS");
                        System.out.println("1- TONELI");
                        System.out.println("2- SEARA");
                        System.out.println("3- AURORA");
                        int produtosPresuntoQuantidade = leitor.nextInt();
                        switch (produtosPresuntoQuantidade) {
                            case 1:
                                System.out.println("TONELI FAT 2KG");
                                System.out.println("QUANTIDADE: 3.822,56 KG");
                                System.out.println("END-RUA : D, PALLET : 4");
                                break;
                            case 2:
                                System.out.println("SEARA CX2PC 3.75KG");
                                System.out.println("QUANTIDADE: 5.122,56 KG");
                                System.out.println("END-RUA : D, PALLET : 5");
                                break;
                            case 3:
                                System.out.println("AURORA CX2PC 3.75KG");
                                System.out.println("QUANTIDADE: 2.122,56 KG");
                                System.out.println("END-RUA : D, PALLET : 6");
                                break;
                            default:
                                System.out.println("OPÇÃO INVÁLIDA");
                        }
                        break;
                    case 5:
                        System.out.println("QUEIJOS | MUSSARELAS");
                        System.out.println("1- TONELI");
                        System.out.println("2- DOM-ARMANDO");
                        System.out.println("3- ROHDEN");
                        int produtosMussarelaQuantidade = leitor.nextInt();
                        switch (produtosMussarelaQuantidade) {
                            case 1:
                                System.out.println("TONELI FAT 2KG");
                                System.out.println("QUANTIDADE: 2.822,56 KG");
                                System.out.println("END-RUA : E, PALLET : 7");
                                break;
                            case 2:
                                System.out.println("DOM ARMANDO CX6PC 4KG");
                                System.out.println("QUANTIDADE: 2.122,56 KG");
                                System.out.println("END-RUA : E, PALLET : 6");
                                break;
                            case 3:
                                System.out.println("ROHDEN FAT 1KG");
                                System.out.println("QUANTIDADE: 5.822,56 KG");
                                System.out.println("END-RUA : E, PALLET : 8");
                                break;
                            default:
                                System.out.println("OPÇÃO INVÁLIDA");
                        }
                        break;
                    case 6:
                        System.out.println("BANHAS | GORDURAS");
                        System.out.println("1- FRIMESA");
                        System.out.println("2- ESTRELA");
                        int produtosBanhas_GordurasQuantidade = leitor.nextInt();
                        switch (produtosBanhas_GordurasQuantidade) {
                            case 1:
                                System.out.println("FRIMESA CX24UN 1KG");
                                System.out.println("QUANTIDADE: 3.122,56 KG");
                                System.out.println("END-RUA : F, PALLET : 9");
                                break;
                            case 2:
                                System.out.println("ESTRELA CX24UN 1KG");
                                System.out.println("QUANTIDADE: 4.122,56 KG");
                                System.out.println("END-RUA : F, PALLET : 10");
                                break;
                            default:
                                System.out.println("OPÇÃO INVÁLIDA");
                        }
                        break;
                    case 7:
                        System.out.println("CALAB-BOVINA");
                        System.out.println("1- SÃO LUIZ");
                        int produtosCalabBovinaQuantidade = leitor.nextInt();
                        if (produtosCalabBovinaQuantidade == 1) {
                            System.out.println("CALABRESA-SÃO-LUIZ-GRANEL PCT 5KG");
                            System.out.println("QUANTIDADE: 3.122,56 KG");
                            System.out.println("END-RUA : G, PALLET : 11");
                        } else {
                            System.out.println("OPÇÃO INVÁLIDA");
                        }
                        break;
                    case 8:
                        System.out.println("DANONE");
                        System.out.println("1- DANONE-ACTIVIA");
                        System.out.println("2- DANONINHO");
                        System.out.println("3- DANONE FAMILIA");
                        int produtosDanoneQuantidade = leitor.nextInt();
                        switch (produtosDanoneQuantidade) {
                            case 1:
                                System.out.println("ACTIVIA MORANGO 15X850G");
                                System.out.println("END-RUA : H, PALLET : 1");
                                break;
                            case 2:
                                System.out.println("DANONINHO 480G 12X40G");
                                System.out.println("END-RUA : H, PALLET : 2");
                                break;
                            case 3:
                                System.out.println("DANONE FAMÍLIA MORANGO 1.25KG");
                                System.out.println("END-RUA : H, PALLET : 3");
                                break;
                            default:
                                System.out.println("OPÇÃO INVÁLIDA");
                        }
                        break;
                    default:
                        System.out.println("PRODUTO NÃO ENCONTRADO");
                }
                break;

            case 2:
                System.out.println("LOCAL SECO - DIGITE A OPÇÃO DESEJADA:");
                System.out.println("1- AZEITES");
                System.out.println("2- AZEITONAS");
                System.out.println("3- BATATA-PALHA");
                System.out.println("4- CATCHUP");
                System.out.println("5- CHARQUE");
                System.out.println("6- COMMODITY");
                System.out.println("7- COPOS DESCARTÁVEIS");
                System.out.println("8- DOCES");
                System.out.println("9- EMBALAGENS");
                System.out.println("10- EXTRATO");
                System.out.println("11- FARINÁCEOS");
                System.out.println("12- FARINHA DE TRIGO");
                System.out.println("13- HIGIENE");
                System.out.println("14- KININO");
                int produtosEstoqueSeco = leitor.nextInt();
                switch (produtosEstoqueSeco) {
                    case 1:
                        System.out.println("AZEITES SELECIONADOS");
                        System.out.println("1- AZEITE GALLO");
                        System.out.println("2- AZEITE PORTO GALLO");
                        System.out.println("3- AZEITE ANDORINHA");
                        int produtosAzeitesEmConservasQuantidade = leitor.nextInt();
                        switch (produtosAzeitesEmConservasQuantidade) {
                            case 1:
                                System.out.println("AZEITE GALLO");
                                System.out.println("CX8 500ML");
                                break;

                            default:
                                System.out.println("PRODUTO NÃO IDENTIFICADO !");
                        }
                        break;
                    case 2:
                        System.out.println("AZEITONAS EM CONSERVA");
                        System.out.println("END-RUA : I, PALLET : 2");
                        break;
                    case 12:
                        System.out.println("FARINHA DE TRIGO ESPECIAL");
                        System.out.println("END-RUA : J, PALLET : 5");
                        break;
                    default:
                        System.out.println("DETALHES DO SETOR SECO EM ATUALIZAÇÃO");
                }
                break;

            default:
                System.out.println("AMBIENTE NÃO IDENTIFICADO");
                break;
        }

        leitor.close();
    }
}