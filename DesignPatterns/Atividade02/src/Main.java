public class Main {
    public static void main(String[] args) {
        FactoryAlunoMecatronica oFabrica = new FactoryAlunoMecatronica();
        Aluno oAluno = oFabrica.criarAluno();
        System.out.println(oAluno.exibirInfo());
    }
}
