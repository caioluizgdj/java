import java.util.Scanner;

public class menu {
    static Scanner teclado = new Scanner(System.in); //para ter intereção com o usuário

    public static void main(String[] args) {
        int opcao;
        double valor;

        Pessoa titular1 = new Pessoa();
        titular1.nome = "Caio Luiz Gomes de Jesus";
        titular1.documento = "11706129222";

        Conta minhaConta = new Conta(titular1, 1308, 2002);
        minhaConta.saldo = 0.0;

        do {
            System.out.println("MENU");
            System.out.println("1 - SALDO   |  2 - SAQUE\n3 - DEPOSITO  |  4 - SAIR");
            System.out.println("Coloque o numero da opção desejada: ");
            opcao = teclado.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Seu saldo é: " + minhaConta.saldo);
                    break;
                case 2:
                    System.out.println("Valor do saque: ");
                    valor = teclado.nextDouble();
                    minhaConta.saque(valor);
                    System.out.println("Saque efetuado com sucesso!");
                    break;
                case 3:
                    System.out.println("Valor do depósito: ");
                    valor = teclado.nextDouble();
                    minhaConta.deposito(valor);
                    System.out.println("Depósito efetuado com sucesso!");
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 4);
    }
}
