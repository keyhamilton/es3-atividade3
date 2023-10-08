package questao2;

import java.util.ArrayList;
import java.util.List;

public class TestaCalculadora {
    public static void main(String[] args) {

        List <String> operacoes;

        operacoes = new ArrayList<String>();

        operacoes.add("soma");
        
        Calculadora calculadora = new Calculadora(2, 3);

        String resultados = calculadora.calcular(operacoes).toString();

        System.out.println(resultados);
    }
}
