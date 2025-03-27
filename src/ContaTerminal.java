import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);

       System.out.println("Digite o número da conta(máximo de 4 números): ");
       int numero = scanner.nextInt();
       System.out.println("Digite o número da agência(máximo de 4 números):");
       String agencia = scanner.next();
       System.out.println("Digite seu nome:");
       String nome = scanner.next();
       System.out.println("Digite o saldo:");
       Double saldo = scanner.nextDouble();

       int numeros = String.valueOf(numero).length();
       int agencias = agencia.length();

        if (numeros > 4 || agencias > 4) {
            System.out.println("Número da conta ou agência inválidos, somente 4 números");
            return;
        }if (numeros < 4 || agencias < 4) {
            System.out.println("Número da conta ou agência inválidos, por favor coloque 4 números");
            return;
        }

       System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia+", conta "+ numero+" e seu saldo "+saldo+" e já está disponível para saque\".");

    }
}
