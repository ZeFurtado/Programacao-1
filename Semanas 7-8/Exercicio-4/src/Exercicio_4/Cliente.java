package Exercicio_4;

public class Cliente {
    private String nome;
    private Carro carro = new Carro("Honda", 90000 );


    public Cliente(String nome, Carro carro){
        this.nome = nome;
        this.carro = carro;
    }

    public void setCarro(Carro carro){
        this.carro = carro;
    }
    public Carro getCarro(Carro carro){return carro;}



}
