import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Caro cliente, digite seu nome: ")
        String nomeCliente = scanner.next();

        System.out.println("Digite em qual agência deseja abrir sua conta: ");
        int numeroAgencia = scanner.nextInt();

        System.out.println("Digite em qual agência deseja abrir sua conta: ");
        int numeroConta = 1;
        
        double saldoConta = 2000.3;

        System.out.println("Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque");
    }
}
