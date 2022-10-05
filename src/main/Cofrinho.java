package main;

import java.util.ArrayList;
import java.util.List;

public class Cofrinho {

//    Atributo para armazenar uma lista de moedas
    private List<Moeda> listaMoedas = new ArrayList<>();

//    Método que adiciona uma moeda no cofrinho
    public void adicionar(Moeda moeda) {
        listaMoedas.add(moeda);
    }

//    Método que remove uma moeda do cofrinho
    public void remover(Moeda moeda) {
        listaMoedas.remove(moeda);
    }

//    Esse método imprime na tela todas as moedas presentes no cofrinho
    public void listagemMoedas() {
        System.out.println("----------------");
        for (Moeda moeda: listaMoedas) {
            moeda.info();
            System.out.println("----------------");
            System.out.println();
        }
    }

//    Esse método retorna o valor total somado de todas as moedas do cofrinho, convertido para real
    public double totalConvertido() {
        double total = 0;
        for (Moeda moeda: listaMoedas) {
            total += moeda.converter().valor;
        }
        return total;
    }

    public List<Moeda> getListaMoedas() {
        return listaMoedas;
    }
}
