import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        double saldo = 237.48; //definido um valor padrão, pois este não pode ser indicado pelo usuário!
        
        // TODO
        // Para entrada de dados do usuário, implementar:
        // formatação para "nomeCliente": iniciar cada nome com letra maiúscula;
        // limitar a quantidade de dígitos de "numeroConta";
        // limitar a quantidade de dígitos de "numeroAgencia" e definir padrão com "-";
        
        // entrada de dados do usuário para criação da conta:
        Scanner inputScanner = new Scanner(System.in);
            System.out.println("Por favor, me diga o seu nome e sobrenome: ");
                String nomeCliente = inputScanner.nextLine();
            System.out.println("Agora, me forneça o número de quatro dígitos da conta (ex:. 1021): ");   
                int numeroConta = inputScanner.nextInt();
            System.out.println("Perfeito! Para finalizarmos, me informe o número da agência (ex:. 067-8): ");
                String numeroAgencia = inputScanner.next();
                
        //mensagem final com o agradecimento e a impressão dos dados informados pelo usuário + fim da classe Scanner:    
            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " +
                                numeroAgencia + ", conta " + 
                                numeroConta + " e seu saldo de R$" + saldo + " já está disponível para saque! ;)");
        inputScanner.close();
    }
}
