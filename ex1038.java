import java.util.Scanner;
public class ex1038{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int item, quantidade;
        float preco;

        item = teclado.nextInt();
        quantidade = teclado.nextInt();

        if (item == 1)
        preco = quantidade * 4.00f;
        else
            if (item == 2)
            preco = quantidade * 4.50f;
            else
                if (item == 3)
                preco = quantidade * 5.00f;
                else
                    if (item == 4)
                    preco = quantidade * 2.00f;
                    else  
                    preco = quantidade * 1.50f;

        System.out.printf("Total: R$ %.2f\n",preco);
                      
    }

}