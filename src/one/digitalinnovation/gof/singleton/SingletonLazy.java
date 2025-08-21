package one.digitalinnovation.gof.singleton;

public class SingletonLazy {

    private static SingletonLazy instancia;

    private SingletonLazy() {
    }

    public static synchronized SingletonLazy getInstancia() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }

    @Override
    public String toString() {
        return "Instância SingletonLazy: " + System.identityHashCode(instancia);
    }
}
