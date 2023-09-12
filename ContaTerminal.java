import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é o seu nome?");
        String nomeDoCliente = scanner.nextLine();

        System.out.println("Qual é a sua agência?");
        String agencia = scanner.nextLine();

        System.out.println("Qual é o número da sua conta?");
        int numeroDaConta = scanner.nextInt();

        System.out.println("Quanto dineiro você terá dispoinível na sua conta?");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeDoCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroDaConta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
