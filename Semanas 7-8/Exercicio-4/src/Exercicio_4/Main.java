package Exercicio_4;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        Carro carroAjenor = new Carro("Honda", 50000);
        carroAjenor.setPreco(90.000);
        Cliente cliente = new Cliente("Ajenor", carroAjenor);


        System.out.println(main.devolveValor('a'));
        System.out.println("O carro do pinta é: "+carroAjenor.getMarca()+ " e custa R$:"+carroAjenor.getPreco());
    }


    public int devolveValor(char letra){
        return letra;
    }
}