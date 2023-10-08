package questao6;

import java.util.List;

class AuditoriaFinanceiraService {
    public void executar(List<Auditavel> auditaveis) {
        auditaveis.forEach(
            audit -> audit.auditar()
        );
    }
}
