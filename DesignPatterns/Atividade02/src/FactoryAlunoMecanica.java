public class FactoryAlunoMecanica implements InterfaceFactoryAluno {

    public Aluno criarAluno() {
        return new AlunoMecanica();
    }
}
