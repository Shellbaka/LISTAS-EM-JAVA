package Pessoas;

public class TesteOrdem {
    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Cleber", 17, 1.74);
        ordenacaoPessoa.adicionarPessoa("Junior", 23, 1.70);
        ordenacaoPessoa.adicionarPessoa("Adalberto", 16, 1.80);
        ordenacaoPessoa.adicionarPessoa("Roger", 40, 1.69);
        ordenacaoPessoa.adicionarPessoa("Firmino", 39, 1.71);

         System.out.println(ordenacaoPessoa.ordenarPorAltura());

    }
}
