package one.digitalinnovation.gof;

import subsistema1.crm.CrmService;
import subsistema2.cep.CepApi;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.Comportamento;
import one.digitalinnovation.gof.strategy.ComportamentoAgressivo;
import one.digitalinnovation.gof.strategy.ComportamentoDefensivo;
import one.digitalinnovation.gof.strategy.ComportamentoNormal;
import one.digitalinnovation.gof.strategy.Robo;

public class Test {

    public static void main(String[] args) {

        // ---------- SINGLETON ----------
        System.out.println("=== Teste Singleton ===");
        
        SingletonLazy lazy1 = SingletonLazy.getInstancia();
        SingletonLazy lazy2 = SingletonLazy.getInstancia();
        System.out.println(lazy1);
        System.out.println(lazy2);

        SingletonEager eager1 = SingletonEager.getInstancia();
        SingletonEager eager2 = SingletonEager.getInstancia();
        System.out.println(eager1);
        System.out.println(eager2);

        SingletonLazyHolder holder1 = SingletonLazyHolder.getInstancia();
        SingletonLazyHolder holder2 = SingletonLazyHolder.getInstancia();
        System.out.println(holder1);
        System.out.println(holder2);

        // ---------- STRATEGY ----------
        System.out.println("\n=== Teste Strategy ===");
        
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        // ---------- INTEGRAÇÃO COM CEP E CRM ----------
        System.out.println("\n=== Teste API Cep + CRM ===");

        CepApi cepApi = CepApi.getInstancia();
        String cep = "45820-000";
        String cidade = cepApi.recuperarCidade(cep);
        String estado = cepApi.recuperarEstado(cep);

        CrmService.gravarCliente("Venilton", cep, cidade, estado);
    }
}
