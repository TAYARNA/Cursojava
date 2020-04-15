import java.util.Scanner;

public class Salario{
    public static void main(String arg[]){
Scanner teclado;
teclado = new Scanner(System.in);

float salario, imposto, sal_liq;

/* entrada de dados */
float Salario;
        System.out.print("por favor, digite seu salario");
salario = teclado.nextFloat();


/* processamento */
imposto = salario * 15 / 100;
sal_liq = salario - imposto;

/* saída */
System.out.println(" Salario liquido R$" +sal_liq);
System.out.println(" Salario bruto R$"  +salario);
System.out.println(" Imposto R$" +imposto);
    }
}