package subsistema1.crm;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CrmService {

    private CrmService() {
        super();
    }

    public static void gravarCliente(String nome, String cep, String cidade, String estado) {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        System.out.printf(
            "=== Cliente salvo no CRM ===%n" +
            "Nome      : %s%n" +
            "CEP       : %s%n" +
            "Cidade    : %s%n" +
            "Estado    : %s%n" +
            "Cadastrado: %s%n",
            nome, cep, cidade, estado, timestamp
        );
    }
}

