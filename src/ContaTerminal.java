import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Caro cliente, digite seu nome: ")
        String nomeCliente = scanner.next();

        System.out.println("Digite qual agência de sua conta: ");
        String numeroAgencia = scanner.next();

        System.out.println("Digite o númemo de sua conta:  ");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o saldo de sua conta:  ");
        double saldoConta = scanner.nextDouble();

        System.out.println("Olá, " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é"
         + numeroAgencia + ", conta "+ numeroConta +" e seu saldo"+ saldoConta + "já está disponível para saque");
    }
}
