import java.util.ArrayList;
public class Cozinha {
    private int numeroPratos;
    private String tipo;
    private int numeroCozinheiros;
    private int tempoPreparo;
    private int horaAbertura;
    private int horaFechamento;
    private String pratoPrincipal;
    private ArrayList<Ingrediente> ingredientes;
    private ArrayList<Funcionario> funcionarios;

    // Construtor
    public Cozinha(String tipo, int tempoPreparo, int horaAbertura, int horaFechamento, String pratoPrincipal){
        this.tipo = tipo;
        this.tempoPreparo = tempoPreparo;
        this.horaAbertura = horaAbertura;
        this.horaFechamento = horaFechamento;
        this.pratoPrincipal = pratoPrincipal;
        ingredientes = new ArrayList<Ingrediente>();
        funcionarios = new ArrayList<Funcionario>();
    }

    public void AdicionarIngrediente(String nome, String dataValidade){
        Ingrediente ingrediente = new Ingrediente(nome,dataValidade);
        ingredientes.add(ingrediente);
    }

    public void AdicionarFuncionario(String nome, String atividade){
        Funcionario funcionario = new Funcionario(nome, atividade);
        funcionarios.add(funcionario);
    }

    public void ImprimirIngredientes(){
        for(Ingrediente ingre: ingredientes){
            System.out.println(ingre.getDescricao());
        }
    }

    void prepararPratos(){
        // O que eu preciso fazer para preparar um prato?
    }

    void lavarLouca(){

    }

    int getNumeroPratos(){
        return numeroPratos;
    }


    void setNumeroPratos(int numeroPratos){
        this.numeroPratos = numeroPratos;
    }

}