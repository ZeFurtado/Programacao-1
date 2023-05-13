package Fixacao;

public class Melancia extends Fruta{

    double precoAdicional;
    boolean ehEpoca;

    public Melancia (String nome, double preco, double precoAdicional, boolean ehEpoca){
        super(nome, preco);
        this.precoAdicional = precoAdicional;
        this.ehEpoca = ehEpoca;
    }

    public double getPrecoAdicional() {
        return precoAdicional;
    }

    public void setPrecoAdicional(double precoAdicional) {
        this.precoAdicional = precoAdicional;
    }

    public boolean isEhEpoca() {
        return ehEpoca;
    }

    public void setEhEpoca(boolean ehEpoca) {
        this.ehEpoca = ehEpoca;
    }
}
