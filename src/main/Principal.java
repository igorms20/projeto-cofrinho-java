package main;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Cofrinho cofrinho = new Cofrinho();  // Instanciação do cofrinho
        Scanner scanner = new Scanner(System.in);  // Esse objeto lê dados de entrada

        System.out.println("COFRINHO");
        while (true) {
            listarOpcoes();
            int opcaoCofrinho = scanner.nextInt();
            if (opcaoCofrinho == 1) {
                opcoesMoeda();
                int opcaoMoeda = scanner.nextInt();
                System.out.println("Digite o valor:");
                double valor = scanner.nextDouble();
                if (opcaoMoeda == 1) {
                    cofrinho.adicionar(new Real(valor));
                } else if (opcaoMoeda == 2) {
                    cofrinho.adicionar(new Dolar(valor));
                } else if (opcaoMoeda == 3) {
                    cofrinho.adicionar(new Euro(valor));
                }
            } else if (opcaoCofrinho == 2) {
                opcoesMoeda();
                int opcaoMoeda = scanner.nextInt();
                System.out.println("Digite o valor:");
                double valor = scanner.nextDouble();
                Moeda moedaRemovida = null;
                for (Moeda moeda: cofrinho.getListaMoedas()) {
                    if (moeda.valor == valor) {
                        moedaRemovida = moeda;
                        break;
                    }
                }
                cofrinho.remover(moedaRemovida);
            } else if (opcaoCofrinho == 3) {
                cofrinho.listagemMoedas();
            } else if (opcaoCofrinho == 4) {
                System.out.println("----------------------------------------");
                System.out.printf("Total convertido para real: R$ %.2f\n", cofrinho.totalConvertido());
                System.out.println("----------------------------------------");
            } else if (opcaoCofrinho == 0) {
                break;
            }
        }
        System.out.println("Fim do programa");
    }

    public static void listarOpcoes() {
        System.out.println("1 - Adicionar moeda");
        System.out.println("2 - Remover moeda");
        System.out.println("3 - Listar moedas");
        System.out.println("4 - Calcular total convertido para Real");
        System.out.println("0 - Encerrar");
    }

    public static void opcoesMoeda() {
        System.out.println("Escolha a Moeda:");
        System.out.println("1 - Real");
        System.out.println("2 - Dolar");
        System.out.println("3 - Euro");
    }

//    public void escolherMoeda(int opcao) {
//        switch (opcao) {
//            case 1:
//                new Real()
//        }
//
//    }
}
