class Ingrediente{
    private String nome;
    private String dataDeValidade;

    // Construtor
    public Ingrediente(String nome, String dataDeValidade){
        this.nome = nome;
        this.dataDeValidade = dataDeValidade;
    }

    public String getDescricao(){
        return nome + " " + dataDeValidade;
    }
}