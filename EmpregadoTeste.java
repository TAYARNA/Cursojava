public class EmpregadoTeste{
    public static void main(String args[]){
        Empregado e1;

        e1 = new Empregado ("Emerson Ramos", 7900.54);

        Empregado e2;
        e2 = new Empregado ("Juan Rosano", 4580.99);


        e1.imprimir();
        e1.aumentarsalario();
        e2.imprimir();
    }
}