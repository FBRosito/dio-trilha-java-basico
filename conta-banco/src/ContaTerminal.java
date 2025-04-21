import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao banco Digital de ROSITO & DIO!");

        System.out.println("\nPor favor, digite o número da Agência:");
        String numeroAgencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da conta:");
        int numeroConta = scanner.nextInt();

        // Consume the newline character left by nextInt()
        scanner.nextLine();

        System.out.println("Por favor, digite o seu nome:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo total da conta:");
        double numeroSaldo = scanner.nextDouble();

        scanner.close();
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + numeroSaldo + " já está disponível para saque.");
    }
}
