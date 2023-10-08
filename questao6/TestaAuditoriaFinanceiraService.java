package questao6;

import java.util.ArrayList;
import java.util.List;

public class TestaAuditoriaFinanceiraService {
    public static void main(String[] args) {
        // criando transações
        Transacao t1 = new Transacao(1, 100.0, TipoTransacao.CREDITO);
        Transacao t2 = new Transacao(1, 100.0, TipoTransacao.CREDITO);
        Transacao t3 = new Transacao(2, 100.0, TipoTransacao.CREDITO);
        Transacao t4 = new Transacao(3, 100.0, TipoTransacao.CREDITO);
        Transacao t5 = new Transacao(1, 100.0, TipoTransacao.CREDITO);
        // adicionando transações à lista
        List<Transacao> transacaos = new ArrayList<Transacao>();
        transacaos.add(t5);
        transacaos.add(t4);
        transacaos.add(t3);
        transacaos.add(t2);
        transacaos.add(t1);
        
        // criando conta
        ContaCorrente c1 = new ContaCorrente("1", 100, transacaos);
        // criando investimento
        Investimento xp1 = new Investimento(1, 50.0, TipoInvestimento.RENDA_FIXA, c1);
        // criando lista de auditáveis
        List<Auditavel> auditaveis = new ArrayList<Auditavel>();
        // adicionando auditáveis
        auditaveis.add(xp1);
        auditaveis.add(c1);
        // criando serviço de auditoria financeira
        AuditoriaFinanceiraService auditoriaFinanceiraService = new AuditoriaFinanceiraService();
        // executando auditorias
        auditoriaFinanceiraService.executar(auditaveis);

    }
}
