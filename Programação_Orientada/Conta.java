package Programação_Orientada;

public class Conta{

    public double saldoPoupanca=50.00;
    
    public double dinheiro;

    public double SaldoConta(){
        return saldoPoupanca;
    }
    public double Deposito(){
        return saldoPoupanca+dinheiro;
    }
    public double Saque(){
        return saldoPoupanca-dinheiro;
    }
}

