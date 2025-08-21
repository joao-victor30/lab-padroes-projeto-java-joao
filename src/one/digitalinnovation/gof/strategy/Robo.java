package one.digitalinnovation.gof.strategy;

import java.util.Objects;

public class Robo {

    private Comportamento comportamento;

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = Objects.requireNonNull(comportamento, "Comportamento não pode ser nulo");
    }

    public void mover() {
        if (comportamento == null) {
            System.out.println("[ERRO] Nenhum comportamento definido para o robô!");
            return;
        }
        comportamento.mover();
    }
}
