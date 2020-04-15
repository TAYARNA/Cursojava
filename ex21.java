import java.util.Scanner;
public class ex21{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int idade;

        System.out.println("Digite sua idade");
        idade = teclado.nextInt();
        
        if (idade < 16){
            System.out.println("NAO ELEITOR");
        }
        else{
            if ((idade >= 18) && (idade <= 65)){
                System.out.println("OBRIGATORIO");
            }
            else{
                    System.out.println("FACULTATIVO");
            
    }
}
}
}