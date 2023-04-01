import java.util.Scanner;

public class Login {
    private Jogador[] jogadores;
    private int total;



    public Login(int tamMax) {
        jogadores = new Jogador[tamMax];
    }

    public Jogador[] getJogadores () {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    public void adicionarJogadores(String nome, int idade, int senha) {

        Jogador jogadorParaAdicionar = new Jogador(nome, idade, senha);

        this.jogadores[total] = jogadorParaAdicionar;
        total++;

    }

    public void exibirJogadores() {
        for(int i = 0; i < jogadores.length; i++) {
            if(jogadores[i] != null) {
                System.out.print(jogadores[i]);
            }  else
                System.out.print("|Jogador ainda não cadastrado| ");
            }
        }
    }


