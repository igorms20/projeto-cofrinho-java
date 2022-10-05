package main;

public abstract class Moeda {

//    Propriedade referente ao valor da moeda
    protected double valor;

    public Moeda(double valor) {
        this.valor = valor;
    }

    //    Método que será implementado em cada subclasse para apresentar informações sobre a moeda correspondente
    public abstract void info();

//    Método abstrato que será implementado em cada subclasse de Moeda de forma diferente
    public abstract Real converter();
}
