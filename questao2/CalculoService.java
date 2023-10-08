package questao2;

public class CalculoService {
    private final double a;
    private final double b;

    public CalculoService(double a2, double b2){
        this.a = a2;
        this.b = b2;
        
    }

    public double calcular(String operacao) {
        switch (operacao) {
            case "soma":
                Soma soma = new Soma();
                return soma.executar(a, b);
            case "subtracao":
                Subitracao sub = new Subitracao();
                return sub.executar(a, b);
            case "multiplicacao":
                Multiplicacao mul = new Multiplicacao();
                return mul.executar(a, b);
            case "divisao":
                Divisao div = new Divisao();
                return div.executar(a, b);
            default:
                throw new IllegalArgumentException("Operação não suportada: " +
                        operacao);
        }
    }
}
