package tecnicos.banco.cofre;

public class CofreDigital extends Cofre{

    private Integer senha;

    public CofreDigital(Integer senha) {
        super("Cofre Digital", "Senha");
        this.senha = senha;
    }

    public void atualizarSenha(int novaSenha) {
        this.senha = novaSenha;
    }

    public boolean validarSenha(int confirmacaoSenha) {
        return confirmacaoSenha == this.senha;
    }
}
