import java.util.Scanner;

public class Data{
    public static void main(String arg[]){

        Scanner teclado = new Scanner(System.in);


    int dia, mes, ano, res, data;

    System.out.print("por favor, digite a data");
    data = teclado.nextInt();

    ano = data % 10000;
    res = data / 10000;

    dia = res / 100;
    mes = res % 100;

    System.out.println("Ano = " +ano);
    System.out.println("Mes = " +mes);
    System.out.println("Dia = " +dia);
    }
}