import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        // Peça ao usuário para inserir dois números e uma operação
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        System.out.print("Digite a operação (+, -, *, /): ");
        String operacao = scanner.next();

        // Realize o cálculo correspondente com base na operação inserida
        double resultado;
        switch (operacao) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: divisão por zero!");
                    return;
                }
                break;
            default:
                System.out.println("Erro: operação inválida!");
                return;
        }

        // Imprima o resultado da operação
        System.out.println("O resultado da operação é: " + resultado);
    }
}