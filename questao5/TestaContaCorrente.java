package questao5;

import java.util.ArrayList;
import java.util.List;

public class TestaContaCorrente {
    public static void main(String[] args) {
        // criando conta
        ContaCorrente c1 = new ContaCorrente("1", 15000);
        // criando lista de transações
        List<Transacao> transacaos = new ArrayList<Transacao>();
        // criando transações
        Transacao t1 = new Transacao(1, 0, TipoTransacao.CREDITO);
        Transacao t2 = new Transacao(2, 100.0, TipoTransacao.CREDITO);
        Transacao t3 = new Transacao(3, 0, TipoTransacao.CREDITO);
        // adicionando as transações à lista
        transacaos.add(t3);
        transacaos.add(t2);
        transacaos.add(t1);
        // filtrando transações inválidas
        List<Transacao> transacoesInvalidas = c1.filtrarTransacoesInvalidas(transacaos);
        transacoesInvalidas.forEach(
            t -> System.out.println("Transação inválida com id: " + t.getId())
        );

    }
}
