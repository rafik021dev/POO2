public class Programador extends Funcionario{

    public Programador(String nome, double salario){
        super(nome, salario);
    }

    public double calcularSalario(){
        return this.salario + 4000;
    }
}
