import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Login login = new Login(100);

        String nome;
        int senha;
        int idade;
        int escolhaLoop;
        int escolhaLogin;

        System.out.println("Bem vido ao cadastramento de jogadores :)");
        do {

            System.out.println("1-Cadastramento de jogador\n2-Exibir jogadores cadastrados");
            escolhaLogin = input.nextInt();

            if (escolhaLogin == 1) {

                System.out.println("Digite o nome, a idade e a senha do jogador respectivamente: ");

                nome = input.next();
                senha = input.nextInt();
                idade = input.nextInt();

                login.adicionarJogadores(nome, idade, senha);

            } else if (escolhaLogin == 2) {
                login.exibirJogadores();
            }

            System.out.println("\nDeseja continuar no cadastro? (1 para sim / 2 para não)");
            escolhaLoop = input.nextInt();

        } while (escolhaLoop == 1);

    }
}
