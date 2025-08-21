package one.digitalinnovation.gof.singleton;

public class SingletonLazyHolder {

    private SingletonLazyHolder() {
    }

    private static class InstanceHolder {
        private static final SingletonLazyHolder INSTANCIA = new SingletonLazyHolder();
    }

    public static SingletonLazyHolder getInstancia() {
        return InstanceHolder.INSTANCIA;
    }

    @Override
    public String toString() {
        return "Instância SingletonLazyHolder: " + System.identityHashCode(InstanceHolder.INSTANCIA);
    }
}
