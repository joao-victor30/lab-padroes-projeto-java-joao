package one.digitalinnovation.gof.strategy;

public class ComportamentoNormal implements Comportamento {

    @Override
    public void mover() {
        System.out.println("[NORMAL] Movendo-se normalmente...");
    }
}
