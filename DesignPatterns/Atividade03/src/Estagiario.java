public class Estagiario extends Funcionario{

    public Estagiario(String nome, double salario){
        super(nome, salario);
    }

    public double calcularSalario(){
        return this.salario + 2000;
    }
}
