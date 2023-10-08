package questao6;

import java.util.List;

class ContaCorrente implements Auditavel {
    private String numero;
    private double saldo;
    private List<Transacao> transacaos;

    public ContaCorrente(String i, double saldo, List<Transacao> transacaos) {
        this.numero = i;
        this.saldo = saldo;
        this.transacaos = transacaos;
    }

    // retorna uma lista de transações inválidas.
    public List<Transacao> filtrarTransacoesInvalidas() {

        List<Transacao> transacoesInvalidas;

        ContaCorrenteService contaCorrenteService = new ContaCorrenteService();

        transacoesInvalidas = contaCorrenteService.filtrarTransacoesInvalidas(this);

        return transacoesInvalidas;

    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Transacao> getTransacaos() {
        return this.transacaos;
    }

    @Override
    public void auditar() {
        List<Transacao> transacoesInvalidas;

        ContaCorrenteService contaCorrenteService = new ContaCorrenteService();

        transacoesInvalidas = contaCorrenteService.filtrarTransacoesInvalidas(this);

        contaCorrenteService.auditar(transacoesInvalidas);
    }
}
