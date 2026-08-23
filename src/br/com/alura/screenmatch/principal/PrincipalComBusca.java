package br.com.alura.screenmatch.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

// Consumindo uma API
public class PrincipalComBusca {
    static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um filme para a busca: ");
        var busca = sc.nextLine();

        // Concatenando o filme com a URL
        String endereco = "https://www.omdbapi.com/?t=" + busca + "&apikey=5ebf0c43";

        // Design Patterns (padrões de projeto)
        HttpClient client = HttpClient.newHttpClient();

        // .newBuilder() = ferramenta para montar/configurar um objeto
        // .build() = finaliza a montagem e cria/retorna o objeto
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
