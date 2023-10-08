package questao6;

import java.util.List;

public class TransacaoService {
    public boolean verificarFraude(Transacao transacao, List<Transacao> transacoes) {
        int count = 0;
        boolean isFraudulenta = false;
        for(  Transacao transac : transacoes){
            if(transac.getId() == transacao.getId()) {
                count = count + 1;
            }
        }
        if(count > 1) {
            isFraudulenta = true;
        }
        return isFraudulenta;
    }
}
