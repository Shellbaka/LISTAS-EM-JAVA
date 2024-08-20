package Livro;

public class App {
    public static void main(String[] args) {
    
       CatalogoLivros catalogoLivros = new CatalogoLivros();
       catalogoLivros.adcionarLivro("Rei dos Piratas", "john Piper", 2019);
       catalogoLivros.adcionarLivro("Rei dos Tolos", "Jonas Madureira", 2016);
       catalogoLivros.adcionarLivro("Rei dos Trolls", "Jonas Madureira", 2024);
       catalogoLivros.adcionarLivro("Rei dos trolls", "Max Lucado", 2010);

       System.out.println(catalogoLivros.pesquisarPorTitulo("Rei dos Piratas"));
    }

}