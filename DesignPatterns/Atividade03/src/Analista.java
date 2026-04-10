public class Analista extends Funcionario{

    public Analista(String nome, double salario){
        super(nome, salario);
    }

    public double calcularSalario(){
        return this.salario + 8000;
    }
}
