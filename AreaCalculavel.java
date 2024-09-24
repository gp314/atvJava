/**
 * AreaCalculavel 
 */
public interface AreaCalculavel {

    double calculaArea();
}

class Quadrado implements AreaCalculavel{

    String forma;
    double lado;
    Quadrado (String forma){
        this.forma=forma;
    }
    public String toString(){
        return "Quadrado";
    }
    Quadrado (double lado){
        this.lado=lado;
    }
    public double calculaArea(){
        return Math.pow(lado,2);
    }
   
}

class Circulo implements AreaCalculavel{
    String forma;
    double raio;
    
    Circulo (String forma){
        this.forma=forma;
    }
    public String toString(){
        return "Círculo";
    }
    Circulo (double raio){
        this.raio=raio;
    }
    public double calculaArea(){
        return Math.PI*raio*raio;
    }
}
class Retangulo implements AreaCalculavel{
    String forma;
    double base;
    double altura;
    
    Retangulo (String forma){
        this.forma=forma;
    }
    public String toString(){
        return "Retângulo";
    }
    Retangulo (double base, double altura){
        this.base=base;
        this.altura=altura;
    }
    public double calculaArea(){
        return base*altura;
    }
}

class Triangulo implements AreaCalculavel{
    String forma;
    double base;
    double altura;
    
    Triangulo (String forma){
        this.forma=forma;
    }
    public String toString(){
        return "Retângulo";
    }

    Triangulo (double base, double altura){
        this.base=base;
        this.altura=altura;
    }
    public double calculaArea(){
        return (base*altura)/2;
    }
    
}

class Losango implements AreaCalculavel{
    String forma;
    double diagMaior;
    double diagMenor;

    Losango(String forma){
        this.forma=forma;
    }
    public String toString(){
        return "Losango";
    }
    Losango(double diagMaior, double diagMenor){
        this.diagMaior=diagMaior;
        this.diagMenor=diagMenor;
    }
    public String getforma() {
        return forma;
    }
    public double calculaArea(){
        return (diagMaior*diagMenor)/2;
    }
}


class Test{
    public static void main(String[] args) {

        AreaCalculavel[] geometrico = new AreaCalculavel[5];
        geometrico[0]=new Quadrado (5.0);
        geometrico[1]=new Circulo (3.00);
        geometrico[2]=new Retangulo (10.0,4.0);
        geometrico[3]=new Triangulo (5.0,3.0);
        geometrico[4]=new Losango (50.0,50.0);
        
        for (AreaCalculavel AreaCalculavel:geometrico){
            System.out.println(AreaCalculavel+" :"+AreaCalculavel.calculaArea());
        }
    }
}       /*for (int i =0 ; i < geometrico.length; i++){
    
}*/
//.exibirFormas()
//System.out.println(geometrico+"Tem área: "+AreaCalculavel.calculaArea());
//System.out.println(geometrico[i]+"tem área de: "+calculaArea());