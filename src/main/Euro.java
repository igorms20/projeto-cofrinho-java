package main;

public class Euro extends Moeda {

    public Euro(double valor) {
        super(valor);
    }

    @Override
    public void info() {
        System.out.println("Euro - " + valor);
    }


    @Override
    public Real converter() {
        return new Real(this.valor * 5.14);
    }
}
