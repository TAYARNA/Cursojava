import java.util.Scanner;

public class exif{
    public static void main(String arg[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
        float n1, n2, me;  
        System.out.print("por favor, digite a nota 1");
        n1 = teclado.nextFloat();      
        System.out.print("por favor, digite a nota 2");
        n2 = teclado.nextFloat();      

        me = (n1 + n2)/2;
        System.out.println("media:" +me);
        if (me >= 6.0){ 
        System.out.println("APROVADO");
        }
        else{
        System.out.println("REPROVADO");
        }
    }
}