package questao4;

import java.util.List;

public class ValidacaoRendimentos implements ValidacaoImposto {

    @Override
    public void validar(ImpostoDeRenda impostoDeRenda) throws Exception {
        List<Double> rendimentos = impostoDeRenda.getRendimentos();
        double rendaTotal = rendimentos.stream().mapToDouble(Double::doubleValue).sum();

        if (rendaTotal < 0) {
            throw new Exception("Erro: renda negativa");
        }

        if (rendimentos.size() > 5) {
            throw new Exception("Erro: mais de 5 fontes de renda");

        }

    }

}
