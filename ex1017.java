import java.util.Scanner;

public class ex1017{
    public static void main(String arg[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int tempo, velocidade;
        double litros;

        velocidade = teclado.nextInt();
        tempo      = teclado.nextInt();
        
        litros = velocidade / 12.00 * tempo;

        System.out.printf("%.3f\n",litros);
    }
}