package Keyboard;

public class Perguntas {
    public static void main(String[] args) {
        Teclado teclado = new Teclado();
        int num = teclado.leInt("DIgite um número inteiro");
        System.out.println("O número que você digitou foi " + num);
    }
}
