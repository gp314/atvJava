package Programação_Orientada;
import java.util.Scanner;;
public class TestConta{
    public static void main(String[] args) {

        Conta bancoPoupanca = new Conta();
        Tributacao[]tributo=new Tributacao[1];
        tributo[0]=new ContaCorrente(42.00, 300.00, 0.01);
        Opcao tecla = new Opcao();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digita a conta que será usada: ");
        System.out.println("1-Conta Poupança \n2-Conta Corrente");
        int botaoEntraConta=scanner.nextInt();
        tecla.Opcao_();
    if (botaoEntraConta==1) {
        System.out.println("Você acessou a conta poupança!");
        System.out.println("1-Depósito\n2-Saque");
        int botaoOpcaoConta=scanner.nextInt();
            if (botaoOpcaoConta==1) {

            System.out.println("Saldo: "+bancoPoupanca.saldoPoupanca);
            System.out.println("Valor a ser depositado: ");
            double depositar=scanner.nextDouble();
    
                bancoPoupanca.Deposito();
    
            System.out.println("Um depósito de "+depositar+" foi realizado na conta poupança.");
            System.out.println(bancoPoupanca.saldoPoupanca+depositar);
        }else if (botaoOpcaoConta==2){
                System.out.println("Saldo: "+bancoPoupanca.saldoPoupanca);
                System.out.println("Valor a ser sacado: ");
                double sacar =scanner.nextDouble();
                
                bancoPoupanca.Saque();
                    if (bancoPoupanca.saldoPoupanca>50) {
                        System.out.println("Sinto muito, saldo insuficiente!"); 
                    }else{
                    System.out.println("Um saque de "+sacar+" foi realizado na conta poupança.");
                    System.out.println("Total:");
                    System.out.println(bancoPoupanca.saldoPoupanca-sacar);}
        }
        
        
    }if (botaoEntraConta==2) {
        System.out.println("Você acessou a conta corrente!");
        System.out.println("1-Depósito\n2-Saque");
        int botaoOpcaoConta=scanner.nextInt();
        if (botaoOpcaoConta==1) {
            
            }else if(botaoOpcaoConta==2){
            for(Tributacao Tributacao:tributo){
                System.out.println("Saldo disponível para saque: "+Tributacao.calculaTributos());
            }
            System.out.println("Valor a ser sacado: ");
                double sacar =scanner.nextDouble();
            System.out.println("Foi sacado:" +sacar);
            System.out.println(Tributacao.calculaTributos());
            
        }

            
 
        



        scanner.close();
    }
}
}









/*package Programação_Orientada;
import java.util.Scanner;;
public class TestConta{
    public static void main(String[] args) {
        Conta bancoPoupanca = new Conta();
        
        bancoPoupanca.SaldoConta();
        System.out.println(bancoPoupanca.saldoPoupanca);
    }
} */