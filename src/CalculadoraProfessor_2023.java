import java.util.Scanner;
public class CalculadoraProfessor_2023 {
    public static void main(String[] args) throws Exception {
       Scanner input = new Scanner(System.in);

       System.out.println("CALCULADORA DE SALÁRIO DE PROFESSORES");

       System.out.println("Digite o nome do professor: ");
    String name = input.nextLine();

    System.out.println("Qual o regime de pagamento desse professor (CLT, Horista ou PJ)? ");
    String Regimepgmt = input.nextLine();

    Double ValoraReceber = 0.0;

  if (Regimepgmt.equalsIgnoreCase("CLT")) {
            System.out.print("Digite o salário mensal do professor: ");
            double salarioMensal = input.nextDouble();
            ValoraReceber = salarioMensal;
        } else if (Regimepgmt.equalsIgnoreCase("Horista")) {
            System.out.print("Digite o número de horas trabalhadas: ");
            int horasTrabalhadas = input.nextInt();

            System.out.print("Qual o valor da hora de trabalho: ");
            double valorHora = input.nextDouble();

            ValoraReceber = horasTrabalhadas * valorHora;
        } else if (Regimepgmt.equalsIgnoreCase("PJ")) {
            System.out.print("Qual o valor do contrato do professor: ");
            double valorContrato = input.nextDouble();
            ValoraReceber = valorContrato;
        } else {
            System.out.println("Regime de pagamento inválido!");
            System.exit(0);
        }

        System.out.println("Nome do professor: " + name);
        System.out.println("Valor a receber: R$" + ValoraReceber);

input.close();

    }
}
