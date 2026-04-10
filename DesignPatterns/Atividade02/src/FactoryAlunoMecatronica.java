public class FactoryAlunoMecatronica implements InterfaceFactoryAluno {

    public Aluno criarAluno() {
        return new AlunoMecatronica();
    }
}
