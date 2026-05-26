import java.util.Scanner;

public class ex_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o valor da fatia do bolo R$: ");
        double fatia = sc.nextDouble();

        System.out.print("Quanto Renan tem disponível:  ");
        double valorDisponivel = sc.nextDouble();

        if (valorDisponivel >= fatia) {
            System.out.print("Compra aprovada!");
            
        } else {
            double falta = fatia - valorDisponivel;
            System.out.printf("Saldo insuficiente %.2f", falta);
            
        }


        sc.close();
    }
}
