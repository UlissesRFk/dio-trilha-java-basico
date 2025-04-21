import java.util.Scanner; 
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Porfavor, digite o seu Nome! \n");
        String nomeCliente = scanner.nextLine();
        System.out.println("Agora digite o número da sua Agência!");
        int numeroAgencia = scanner.nextInt();
        System.out.println("Agora informe qual é a sua agência!");
        String agencia = scanner.next();
        System.out.print("Para finalizar, digite o seu saldo bancário! \n");
        double saldo = scanner.nextDouble();
        
        System.out.print("Olá " + nomeCliente  + ", obrigado por criar uma conta em nosso banco, sua agência é " +
        agencia + ", conta " +  numeroAgencia + " e seu saldo R$" + saldo + " já está disponível para saque!") ;
    }
}
