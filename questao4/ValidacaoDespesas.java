package questao4;

import java.util.List;

public class ValidacaoDespesas implements ValidacaoImposto {

    @Override
    public void validar(ImpostoDeRenda impostoDeRenda) throws Exception {
        List<Double> despesas = impostoDeRenda.getDespesas();
        double despesaTotal = despesas.stream().mapToDouble(Double::doubleValue).sum();

        if(despesaTotal < 0) {
            throw new Exception("Erro: despesas com valor negativo");
        }
        


    }

}
