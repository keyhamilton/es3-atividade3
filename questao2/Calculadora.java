package questao2;

import java.util.ArrayList;
import java.util.List;

public class Calculadora {
    private final double a;
    private final double b;

    public Calculadora(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public List<Double> calcular(List<String> operacoes) {
        List<Double> resultados = new ArrayList<>();
        CalculoService calculo = new CalculoService(a, b);
        for (String op : operacoes) {
            resultados.add(calculo.calcular(op));
        };
        return resultados;
    }
}
