package questao5;

import java.util.List;



class ContaCorrente {
    private String numero;
    private double saldo;

    public ContaCorrente(String i, double saldo) {
        this.numero = i;
        this.saldo = saldo;
    }

    // retorna uma lista de transações inválidas.
    public List<Transacao> filtrarTransacoesInvalidas(List<Transacao> transacaos) {

        List<Transacao> transacoesInvalidas;

        ContaCorrenteService contaCorrenteService = new ContaCorrenteService();

        transacoesInvalidas = contaCorrenteService.filtrarTransacoesInvalidas(this, transacaos);

        return transacoesInvalidas;

    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}



