package questao6;

import java.util.List;

public class Transacao {
    private int id;
    private double valor;
    private TipoTransacao tipo;

    public Transacao(int id, double valor, TipoTransacao tipo) {
        this.id = id;
        this.valor = valor;
        this.tipo = tipo;
    }

    
    public boolean verificarFraude(List<Transacao> transacaos) {
        TransacaoService transacaoService = new TransacaoService();
        // retorna true caso transação esteja duplicada. Senão, retorna false.
        return transacaoService.verificarFraude(this, transacaos);
    }

    public int getId() {
        return id;
    }

    public double getValor() {
        return valor;
    }

    public TipoTransacao getTipo() {
        return tipo;
    }

}
