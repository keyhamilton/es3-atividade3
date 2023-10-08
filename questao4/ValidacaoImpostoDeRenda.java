package questao4;

import java.util.List;

public class ValidacaoImpostoDeRenda {

    private final List<ValidacaoImposto> validacoes;

    public ValidacaoImpostoDeRenda(List<ValidacaoImposto> validacoes) {
        this.validacoes = validacoes;
    }

    public void validarImposto(ImpostoDeRenda impostoDeRenda ){
        validacoes.forEach(val -> {
            try {
                val.validar(impostoDeRenda);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
