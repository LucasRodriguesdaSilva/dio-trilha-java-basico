
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ContaTerminal contaTerminal = new ContaTerminal();

        exibirMensagem("Digite o nome do Cliente: ");
        contaTerminal.setNomeCliente(scanner.nextLine());

        exibirMensagem("Por favor, digite o número da agência: ");
        contaTerminal.setAgencia(scanner.nextLine());

        exibirMensagem("Digite o número da conta: ");
        contaTerminal.setNumero(scanner.nextInt());      

        exibirMensagem("Digite o saldo: ");
        contaTerminal.setSaldo(scanner.nextDouble());

        contaTerminal.exibirInformacoes();

        scanner.close();
    }

    public static void exibirMensagem(String msg) {
        System.out.println(msg);
    }
}
