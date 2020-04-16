public class Empregado{
    // atributos
    private String  nome;
    private double  salario;


    // criando meu metodo construtor
    public Empregado(String nome, double salario){
        // aqui eu coloco logica para por exemplo, inicializar atributos
        this.nome = nome;
        this.salario = salario;
    }

    // metodos
    public void imprimir() {
        System.out.println("=======Fundacao Ezute=======");
        System.out.println("Nome: " + nome +"\n Salario: "+ salario);
    }

    public void aumentarsalario(){
        salario = salario + (salario * 0.10);
        System.out.printf("Novo salario: \n %.2f", salario);
    }
}