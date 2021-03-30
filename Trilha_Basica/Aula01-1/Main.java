class Main {
  public static void main(String[] args) {

    // Definindo cozinha mineira
    Cozinha cozMin = new Cozinha("Mineira",30,14,20,"Feijoada");

    // Adicionar ingredientes cozinha Mineira
    cozMin.AdicionarIngrediente("Feijão","2021-03-20 18:00:00");
    cozMin.AdicionarIngrediente("Farinha","2022-10-03 19:00:00");
    cozMin.AdicionarIngrediente("Arroz","2022-10-13 12:00:00");
    cozMin.AdicionarIngrediente("Carne de Porco","2021-04-01 16:00:00");
    cozMin.AdicionarIngrediente("Linguica","2022-12-13 19:00:00");

    // Adicionar funcionarios
    cozMin.AdicionarFuncionario("Ana", "Cozinheira Chefe");
    cozMin.AdicionarFuncionario("Kleber", "Cozinheiro Auxiliar");
    cozMin.AdicionarFuncionario("Júlia", "Decoradora de Pratos");
    cozMin.AdicionarFuncionario("João", "Montagem de Pratos");
    
    // Definindo cozinha italiana
    Cozinha cozIt = new Cozinha("Italiana",50,13,22, "Yakissoba");

    // Adicionar ingredientes cozinha Italiana
    cozIt.AdicionarIngrediente("Molho", "2021-04-20 16:00:00");
    cozIt.AdicionarIngrediente("Macarrao", "2021-06-03 12:00:00");
    cozIt.AdicionarIngrediente("Carne", "2021-06-22 12:00:00");

    // Adicionar funcionarios
    cozIt.AdicionarFuncionario("Douglas", "Cozinheiro");
    cozIt.AdicionarFuncionario("Marcos", "Cozinheiro Auxiliar");

    // Definindo cozinha chinesa
    Cozinha cozCh = new Cozinha("Chinesaa",40,10,21,"Yakissoba");

    // Adicionar ingredientes cozinha Chinesa
    cozCh.AdicionarIngrediente("Champignon", "2021-05-03 16:00:00");
    cozCh.AdicionarIngrediente("Brócolis", "2021-08-11 12:00:00");
    cozCh.AdicionarIngrediente("Macarrão", "2021-10-22 18:00:00");
    cozCh.AdicionarIngrediente("Carne", "2021-05-20 12:00:00");

    // Adicionar funcionarios
    cozCh.AdicionarFuncionario("Letícia", "Cozinheira");
    cozCh.AdicionarFuncionario("Marcos", "Ajudante de Cozinha");
    cozCh.AdicionarFuncionario("Luiza", "Garçonete");

    // Imprimir ingredientes da cozinha mineira
    cozMin.ImprimirIngredientes();

  }

}