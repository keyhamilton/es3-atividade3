package questao6;

import java.util.List;
import java.util.stream.Collectors;

public class ContaCorrenteService {

    public List<Transacao> filtrarTransacoesInvalidas(ContaCorrente contaCorrente) {
        List<Transacao> transacoesInvalidas = contaCorrente
        .getTransacaos()
        .stream()
        .filter(t -> t.verificarFraude(contaCorrente.getTransacaos()))
        .collect(Collectors.toList());
        
        return transacoesInvalidas;
    }

    public void auditar(List<Transacao> transacaosIrregurales) {

        System.out.println("\nTransações irregurales:");
        for (Transacao transac : transacaosIrregurales) {
            System.out.println("id: " + transac.getId());
            System.out.println("valor: " + transac.getValor());
            System.out.println("tipo: " + transac.getTipo());

        }
    }
}
