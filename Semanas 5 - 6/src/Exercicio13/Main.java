package Exercicio13;

public class Main {
    public static void main(String[] args)
    {
        ContaCorrente cc1 = new ContaCorrente(15, 2500.000);
        System.out.println(cc1.numeroDaConta);

        ContaCorrente cc2;
        cc2 = new ContaCorrente("Osvaldir teixeira", 15, 2500.00);

        ContaCorrente cc3 = new ContaCorrente();


    }
}
