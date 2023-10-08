package questao3;

import java.util.ArrayList;
import java.util.List;

public class TestaImpostoDeRenda {
    public static void main(String[] args) {

        List<Double> rendimentos = new ArrayList<Double>();

        List<Double> despesas = new ArrayList<Double>();

        rendimentos.add((double) 2500);

        ImpostoDeRenda impostoDeRenda = new ImpostoDeRenda(
            "875455601-12", rendimentos, despesas);

        impostoDeRenda.processar();
    }
}
