public class Jogador {
    private String nome;
    private int senha;
    private int idade;

    public Jogador() {

    }

    public Jogador(String nome, int senha, int idade) {
        this.nome = nome;
        this.senha = senha;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String toString() {

        return "|" +this.nome+ ", " +this.idade+ ", " +this.senha+ "| ";

    }


}
