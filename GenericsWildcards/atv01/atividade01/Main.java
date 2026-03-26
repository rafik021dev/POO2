package atividade01;

public class Main {
    public static void main(String[] args) {

        ClasseGenerica<String> oTexto = new ClasseGenerica<>("Teste");
        String sString = oTexto.getDado();
        System.out.println("String: " + sString);

        ClasseGenerica<Integer> oNumero = new ClasseGenerica<>(67);
        Integer iNum = oNumero.getDado();
        System.out.println("Integer: " + iNum);

        ClasseGenerica<Produto> oProduto = new ClasseGenerica<>(new Produto("Notebook", 3500.00));
        Produto xProduto = oProduto.getDado();
        System.out.println("Produto: " + xProduto);
    }
}