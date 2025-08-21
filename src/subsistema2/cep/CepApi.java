package subsistema2.cep;

import java.util.HashMap;
import java.util.Map;

public class CepApi {

    private static CepApi instancia = new CepApi();
    private Map<String, String[]> baseCep;

    private CepApi() {
        super();
        baseCep = new HashMap<>();
        baseCep.put("45820-000", new String[]{"Eunápolis", "BA"});
        baseCep.put("01000-000", new String[]{"São Paulo", "SP"});
        baseCep.put("20000-000", new String[]{"Rio de Janeiro", "RJ"});
    }

    public static CepApi getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        String[] dados = baseCep.get(cep);
        return dados != null ? dados[0] : "Cidade não encontrada";
    }

    public String recuperarEstado(String cep) {
        String[] dados = baseCep.get(cep);
        return dados != null ? dados[1] : "Estado não encontrado";
    }
}
