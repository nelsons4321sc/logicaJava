//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Operador  ternarios

        int idade = 18;
        double salario = 1500;

        String mensagem = (idade > 17) ?"ele é maior de idade": "ele é de menor de idade";

        System.out.println(mensagem);

        Double novoSalario = (salario <= 1300) ? (1300 * 0.20) +1300  : 1300 + 100;

        System.out.println("Novo salário: "+novoSalario);


    }
}