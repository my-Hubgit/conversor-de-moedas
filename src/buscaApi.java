import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class buscaApi {
    public Dados buscaMoeda(String moedaBase) {
        // Monta a URL com a moeda base que o usuário digitou
        String url = "https://v6.exchangerate-api.com/v6/6d1815513ec24e922098a4c5/latest/" + moedaBase;

        // Cria o cliente HTTP e a requisição
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        try {
            // Envia a requisição e obtém a resposta da API
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Converte a resposta JSON para um objeto da classe Dados
            return new Gson().fromJson(response.body(), Dados.class);

        } catch (IOException | InterruptedException e) { //Trata exceções
            e.printStackTrace();
            throw new RuntimeException("Não consegui obter os dados de câmbio.");
        }
    }
}
