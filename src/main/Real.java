package main;

public class Real extends Moeda {

    public Real(double valor) {
        super(valor);
    }

    @Override
    public void info() {
        System.out.println("Real - " + valor);
    }

    public Real converter() {
        return this;
    }
}
