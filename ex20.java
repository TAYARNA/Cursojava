import java.util.Scanner;
public class ex20{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int sexo;
        float altura, peso;

        System.out.println("Digite 1 - Masculino ou 2 - Feminino");
        sexo = teclado.nextInt();
        System.out.println("Digite a altura");
        altura = teclado.nextFloat();
        if (sexo == 1){
            peso = 72.7f * altura - 58;
        }
        else {
            peso = 62.1f * altura - 44.7f;
        }

        System.out.println("Seu peso ideal deveria ser "+peso);
    }
}