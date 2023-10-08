package questao2;

public class Divisao implements Operacao{

    @Override
    public double executar(double a, double b) {
        if (b == 0) {
            
            throw new UnsupportedOperationException("Divisão por zero");
        } 
        
        return a/b;
    }
    
}
