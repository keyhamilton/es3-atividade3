package questao5;

import java.util.List;
import java.util.stream.Collectors;

public class ContaCorrenteService {
    public List<Transacao> filtrarTransacoesInvalidas(ContaCorrente contaCorrente, List<Transacao> transacaos) {
        List<Transacao> transacoesInvalidas = transacaos
        .stream()
        .filter(t -> t.verificarFraude())
        .collect(Collectors.toList());
        
        return transacoesInvalidas;
    }
}
