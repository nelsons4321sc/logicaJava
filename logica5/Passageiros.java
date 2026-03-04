import java.util.Scanner;

public class Passageiros{

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.printf("Peso máximo da aeronave: ");
        int pesoMaximo = entrada.nextInt();

        System.out.printf("Quantidade de Passageiros: ");
        int totalPassageiros = entrada.nextInt();

        int pesoTotalPassageiros = 0;

        for(int passageiroAtual = 1; passageiroAtual <= totalPassageiros; passageiroAtual++){
            System.out.printf("Peso do passageiro #%d: ", passageiroAtual);
            int pesoPassageiro = entrada.nextInt();

            pesoTotalPassageiros += pesoPassageiro;
        }

        System.out.printf("Peso máximo da aeronave: %d kg%n", pesoMaximo);
        System.out.printf("Peso total dos passageiros: %d kg%n", pesoTotalPassageiros);
        System.out.printf("Situação da aeronave: %s%n",
                pesoTotalPassageiros > pesoMaximo ? "peso excedido" : "liberada");

    }

}