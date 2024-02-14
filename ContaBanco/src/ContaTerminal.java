import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner read = new Scanner(System.in);

        int agencia = 7890;
        String conta = "2234-9";

        System.out.println("Insira seu nome para abertura de conta:\n");
        String nome = read.nextLine();

        System.out.println("Insira o valor de depósito:\n");
        double saldo = read.nextDouble(); 
        
        read.close();
        System.out.println("\"Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+
        ", conta "+conta+" e seu saldo "+saldo+" já está disponível para saque");
    }
}
