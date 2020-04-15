import java.util.Scanner;

public class Leitura{
    public static void main(String arg[]){
        Scanner teclado;
teclado = new Scanner(System.in);


/* entrada de dados */

int valor;
        System.out.print("por favor, digite um valor");
valor = teclado.nextInt();


/* processamento */
valor = valor * 100;

/* saída */

System.out.print(" Novo valor" +valor);
}
}