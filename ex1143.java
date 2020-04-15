import java.util.Scanner;
public class ex1143{
    public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);   
        int valor;
        valor = teclado.nextInt();
        for (int i=1  ; i<=valor  ; i++ ){
            System.out.println(i +" "+ i*i +" " +i*i*i);
        }
    }
}