package one.digitalinnovation.gof.singleton;

public class SingletonEager {

    private static final SingletonEager INSTANCIA = new SingletonEager();

    private SingletonEager() {
    }

    public static SingletonEager getInstancia() {
        return INSTANCIA;
    }

    @Override
    public String toString() {
        return "Instância SingletonEager: " + INSTANCIA.hashCode();
    }
}
