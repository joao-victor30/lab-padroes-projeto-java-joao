package one.digitalinnovation.gof.facade;

import subsistema1.crm.CrmService;
import subsistema2.cep.CepApi;
import java.util.Objects;

public class Facade {

    public void migrarCliente(String nome, String cep) {
        if (nome == null || nome.isBlank()) {
            System.out.println("[ERRO] Nome do cliente inválido!");
            return;
        }
        if (cep == null || cep.isBlank()) {
            System.out.println("[ERRO] CEP inválido!");
            return;
        }

        CepApi cepApi = CepApi.getInstancia();
        String cidade = cepApi.recuperarCidade(cep);
        String estado = cepApi.recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
