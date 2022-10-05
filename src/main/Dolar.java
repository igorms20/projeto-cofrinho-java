package main;

public class Dolar extends Moeda {

    public Dolar(double valor) {
        super(valor);
    }

    @Override
    public void info() {
        System.out.println("Dolar - " + valor);
    }

    @Override
    public Real converter() {
        return new Real(this.valor * 5.30);
    }
}
