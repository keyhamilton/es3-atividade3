package questao5;

public class TransacaoService {
    public boolean verificarFraude(Transacao transacao) {
        if(transacao.getValor() <= 0) {
            return true;
        }

        return false;
    }
}
