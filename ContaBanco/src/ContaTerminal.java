import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Informe o número da Conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Informe a agência: ");
        String agencia = scanner.next();

        System.out.println("Informe o Nome do cliente: ");
        String nomeCliente = scanner.next();

        System.out.println("Informe o Sobrenome do cliente: ");
        String sobreNomeCliente = scanner.next();

        System.out.println("Informe o saldo do cliente: ");
        Double saldo = scanner.nextDouble();

        System.out.printf("Olá %s %s, obrigado por criar a conta em nosso banco, sua agência é %s, conta %d, e seu saldo %.2f já está disponível para saque.", nomeCliente, sobreNomeCliente, agencia, numeroConta, saldo);
    }
}
