import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.print("Informe o numero da Conta: ");
        numero = sc.nextInt();

        System.out.print("Informe o numero da Agencia: ");
        agencia = sc.next();

        System.out.print("Informe o nome do Cliente: ");
        nomeCliente = sc.next();

        System.out.print("Informe o saldo da Conta: ");
        saldo = sc.nextDouble();

        System.out.println("Olá "+ nomeCliente +
                            ", obrigado por criar uma conta em nosso banco, sua agência é " + 
                            agencia + ", conta "  + numero + " e seu saldo " + saldo + 
                            " já está disponível para saque");
    }
}
