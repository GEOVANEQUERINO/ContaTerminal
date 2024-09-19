
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        String nomeDoCliente;
        int numeroDaConta;
        String numeroAgencia;
        double saldoDaConta;
        char controle = 's';

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Por favor digite os dados solicitados");
            System.out.println("Digite o Nome: ");
            nomeDoCliente = sc.next();
            System.out.println("Digite o numero da agência: ");
            numeroAgencia = sc.next();
            System.out.println("Digite o numero da conta ");
            numeroDaConta = sc.nextInt();
            System.out.println("Digite o valor do saldo: ");
            saldoDaConta = sc.nextDouble();

            System.out.println("Deseja continuar ? tecle s ou S");
            controle = sc.next().charAt(0);
        } while (controle == 's' || controle == 'S');

        System.out.println("Olá " + nomeDoCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia +
                " ,conta " + numeroDaConta + " e seu saldo " + saldoDaConta + " ,já está disponivel para saque");

        sc.close();
    }
}
