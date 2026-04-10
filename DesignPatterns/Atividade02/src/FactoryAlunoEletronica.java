public class FactoryAlunoEletronica implements InterfaceFactoryAluno {

    public Aluno criarAluno() {
        return new AlunoEletronica();
    }
}
