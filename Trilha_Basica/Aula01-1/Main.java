class Main {
  public static void main(String[] args) {

    // Definindo cozinha mineira
    Cozinha cozMin = new Cozinha();
    cozMin.tipo = "Mineira";
    cozMin.tempoPreparo = 30;
    cozMin.numeroCozinheiros = 2;
    cozMin.horaAbertura = 14;
    cozMin.horaFechamento = 20;
    cozMin.pratoPrincipal = "Feijoada";

    // Adicionar ingredientes cozinha Mineira
    Ingrediente ingredienteCozMin1 = new Ingrediente();
    Ingrediente ingredienteCozMin2 = new Ingrediente();
    Ingrediente ingredienteCozMin3 = new Ingrediente();
    Ingrediente ingredienteCozMin4 = new Ingrediente();
    Ingrediente ingredienteCozMin5 = new Ingrediente();

    ingredienteCozMin1.nome = "Feijão";
    ingredienteCozMin1.dataDeValidade = "2021-03-20 18:00:00";

    ingredienteCozMin2.nome = "Farinha";
    ingredienteCozMin2.dataDeValidade = "2022-10-03 19:00:00";

    ingredienteCozMin3.nome = "Arroz";
    ingredienteCozMin3.dataDeValidade = "2022-10-13 12:00:00";

    ingredienteCozMin4.nome = "Carne de Porco";
    ingredienteCozMin4.dataDeValidade = "2021-04-01 16:00:00";

    ingredienteCozMin5.nome = "Linguica";
    ingredienteCozMin5.dataDeValidade = "2022-12-13 19:00:00";

    cozMin.ingredientes.add(ingredienteCozMin1);
    cozMin.ingredientes.add(ingredienteCozMin2);
    cozMin.ingredientes.add(ingredienteCozMin3);
    cozMin.ingredientes.add(ingredienteCozMin4);
    cozMin.ingredientes.add(ingredienteCozMin5);

    // Adicionar funcionarios
    Funcionario funcionario1 = new Funcionario();
    Funcionario funcionario2 = new Funcionario();
    Funcionario funcionario3 = new Funcionario();
    Funcionario funcionario4 = new Funcionario();

    funcionario1.nome = "Ana";
    funcionario1.atividade = "Cozinheiro Chefe";

    funcionario2.nome = "Kleber";
    funcionario2.atividade = "Cozinheiro Auxiliar";

    funcionario3.nome = "Júlia";
    funcionario3.atividade = "Decoradora de Pratos";

    funcionario4.nome = "Joao";
    funcionario4.atividade = "Montagem de Pratos";

    cozMin.funcionarios.add(funcionario1);
    cozMin.funcionarios.add(funcionario2);
    cozMin.funcionarios.add(funcionario3);
    cozMin.funcionarios.add(funcionario4);


    // Definindo cozinha italiana
    Cozinha cozIt = new Cozinha();
    cozIt.tipo = "Italiana";
    cozIt.numeroCozinheiros = 2;
    cozIt.tempoPreparo = 50;
    cozIt.horaAbertura = 13;
    cozIt.horaFechamento = 22;
    cozIt.pratoPrincipal = "Yakissoba";

    // Adicionar ingredientes cozinha Mineira
    Ingrediente ingredienteCozIt1 = new Ingrediente();
    Ingrediente ingredienteCozIt2 = new Ingrediente();
    Ingrediente ingredienteCozIt3 = new Ingrediente();

    ingredienteCozIt1.nome = "Molho";
    ingredienteCozIt1.dataDeValidade = "2021-04-20 16:00:00";

    ingredienteCozIt2.nome = "Macarrao";
    ingredienteCozIt2.dataDeValidade = "2021-06-03 12:00:00";

    ingredienteCozIt3.nome = "Carne";
    ingredienteCozIt3.dataDeValidade = "2021-06-22 12:00:00";

    cozIt.ingredientes.add(ingredienteCozIt1);
    cozIt.ingredientes.add(ingredienteCozIt2);
    cozIt.ingredientes.add(ingredienteCozIt3);


    // Adicionar funcionarios
    Funcionario funcionario1CozIt = new Funcionario();
    Funcionario funcionario2CozIt = new Funcionario();

    funcionario1CozIt.nome = "Douglas";
    funcionario1CozIt.atividade = "Cozinheiro";

    funcionario2CozIt.nome = "Marcos";
    funcionario2CozIt.atividade = "Cozinheiro Auxiliar";

    cozIt.funcionarios.add(funcionario1CozIt);
    cozIt.funcionarios.add(funcionario2CozIt);

    // Definindo cozinha chinesa
    Cozinha cozCh = new Cozinha();
    cozIt.tipo = "Chinesa";
    cozIt.numeroCozinheiros = 1;
    cozIt.tempoPreparo = 40;
    cozIt.horaAbertura = 10;
    cozIt.horaFechamento = 21;
    cozIt.pratoPrincipal = "Yakissoba";

    // Adicionar ingredientes cozinha Chinesa
    Ingrediente ingredienteCozCh1 = new Ingrediente();
    Ingrediente ingredienteCozCh2 = new Ingrediente();
    Ingrediente ingredienteCozCh3 = new Ingrediente();
    Ingrediente ingredienteCozCh4 = new Ingrediente();

    ingredienteCozCh1.nome = "Champignon";
    ingredienteCozCh1.dataDeValidade = "2021-05-03 16:00:00";

    ingredienteCozCh2.nome = "Brócolis";
    ingredienteCozCh2.dataDeValidade = "2021-08-11 12:00:00";

    ingredienteCozCh3.nome = "Macarrão";
    ingredienteCozCh3.dataDeValidade = "2021-10-22 18:00:00";

    ingredienteCozCh4.nome = "Carne";
    ingredienteCozCh4.dataDeValidade = "2021-05-20 12:00:00";

    cozCh.ingredientes.add(ingredienteCozCh1);
    cozCh.ingredientes.add(ingredienteCozCh2);
    cozCh.ingredientes.add(ingredienteCozCh3);
    cozCh.ingredientes.add(ingredienteCozCh4);


    // Adicionar funcionarios
    Funcionario funcionario1CozCh = new Funcionario();
    Funcionario funcionario2CozCh = new Funcionario();
    Funcionario funcionario3CozCh = new Funcionario();

    funcionario1CozCh.nome = "Letícia";
    funcionario1CozCh.atividade = "Cozinheira";

    funcionario2CozCh.nome = "Marcos";
    funcionario2CozCh.atividade = "Ajudante de Cozinha";

    funcionario3CozCh.nome = "Luiza";
    funcionario3CozCh.atividade = "Garçonete";

    cozCh.funcionarios.add(funcionario1CozCh);
    cozCh.funcionarios.add(funcionario2CozCh);
    cozCh.funcionarios.add(funcionario3CozCh);
  }

}