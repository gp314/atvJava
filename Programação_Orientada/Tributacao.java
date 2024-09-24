package Programação_Orientada;

public interface Tributacao {

   double calculaTributos();
}
class ContaCorrente implements Tributacao{
    double SeguroDeVida=42.00;
    double saldoContaCorrente=300.00;
    double TaxaEscalada=0.01;
    double dinheiro;
    ContaCorrente(double SeguroDeVida,double saldoContaCorrente,double TaxaEscalada){
        this.SeguroDeVida=SeguroDeVida;
        this.saldoContaCorrente=saldoContaCorrente;
        this.TaxaEscalada=TaxaEscalada;
    }
    public double calculaTributos(){
        return saldoContaCorrente-(saldoContaCorrente*TaxaEscalada)-SeguroDeVida;
}
    public double saqueCorrente(){
        return calculaTributos()-dinheiro;
    }
}
