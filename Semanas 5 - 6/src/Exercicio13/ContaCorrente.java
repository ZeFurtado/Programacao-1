package Exercicio13;

public class ContaCorrente {

    private String codigoDaConta;

    String nomeDoTitular;
    int numeroDaConta;
    double saldoAtual;

    public ContaCorrente()
    {

    }

    public ContaCorrente(int numeroDaConta, double saldoAtual)
    {
        this.numeroDaConta = numeroDaConta;
        this.saldoAtual = saldoAtual;
    }

    public ContaCorrente(String nomeDoTitular, int numeroDaConta, double saldoAtual)
    {
        this.nomeDoTitular = nomeDoTitular;
        this.numeroDaConta = numeroDaConta;
        this.saldoAtual = saldoAtual;
    }

    public String DadosDoUsuario()
    {
        String dadosDoUsuario = "";
        return dadosDoUsuario;
    }


}
