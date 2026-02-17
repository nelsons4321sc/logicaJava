//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Operador  ternarios

        String nome = "João";
        int idade = 16;
        double salario = 1500;

        String mensagem = (idade > 17) ?"ele é maior de idade": "ele é de menor de idade";

       // System.out.println(mensagem);

        Double novoSalario = (salario <= 1300) ? (1300 * 0.20) +1300  : 1300 + 100;

        // System.out.println("Novo salário: "+novoSalario);

        String receberSalario = (idade >= 18) ? "vai receber o novo Salario": "não vai receber novo salario";

       // System.out.println(receberSalario);

        System.out.println(nome+" tem "+idade+" anos de idade, é "+mensagem+" e "+receberSalario+" no valor de "+"R$ "+novoSalario);


    }
}