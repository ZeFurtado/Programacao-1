package Desafio;

public class Pets {

    private String raca;
    private String nome;

    private int idade;


    public Pets(String raca,String nome, int idade){
        this.raca = raca;
        this.nome = nome;
        this.idade = idade;
    }

    public void setRaca(String raca){
        this.raca = raca;
    }
    public String getRaca(){return raca;}

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){return nome;}

    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){return idade;}



}
