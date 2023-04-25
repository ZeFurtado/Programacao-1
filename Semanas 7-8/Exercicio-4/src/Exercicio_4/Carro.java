package Exercicio_4;

public class Carro {

    private String marca;
    private double preco;

    public Carro(String marca, double preco){
        this.marca = marca;
        this.preco = preco;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getMarca(){return marca;}


    public void setPreco(double preco){
        this.preco = preco;
    }
    public double getPreco(){return preco;}


}
