package ListaTarefa;

public class App {
    public static void main(String[] args) throws Exception {
      ListaTarefas listaTarefas = new ListaTarefas();

      System.out.println("O número total de itens nesta lista é de: " + listaTarefas.obterNumeroTotalTarefas());
      listaTarefas.adicionarTarefa("Tarefa 1");
      listaTarefas.adicionarTarefa("Tarefa 2");
      listaTarefas.adicionarTarefa("Tarefa 3");
      listaTarefas.adicionarTarefa("Tarefa 3");
      
      listaTarefas.removerTarefa("Tarefa 3");
      System.out.println("O número total de itens nesta lista é de: " + listaTarefas.obterNumeroTotalTarefas());
    }
}
