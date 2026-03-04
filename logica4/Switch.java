import java.util.Scanner;

public class Switch {
    
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um dia da semana: ");
        String diaSemana  = entrada.nextLine();

        String horarioFuncionamwento = switch (diaSemana){
            case "seg"->  "Fechado";
            case "ter", "qua", "qui", "sex"-> "08:00 ás 18:00";
            case "sab", "dom" ->"08:00hs ás 12:00hs";
            default -> "horário inválido";
        };
/*
        switch (diaSemana){
            case "seg"-> horarioFuncionamwento = "Fechado";
            case "ter", "qua", "qui", "sex"-> horarioFuncionamwento = "08:00 ás 18:00";
            case "sab", "dom" ->{
                horarioFuncionamwento = "08:00hs ás 12:00hs";
            }
            default -> horarioFuncionamwento = "horário inválido";
        }
*/
        System.out.println(horarioFuncionamwento);
    }
}