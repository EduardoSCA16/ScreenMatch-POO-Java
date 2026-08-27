package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.models.Titulo;
import br.com.alura.screenmatch.models.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

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

        // Replace troca o espaço por "_"
        busca = busca.replace(" ", "_");

        String chaveAPI = System.getenv("OMDB_API_KEY");

        // Concatenando o filme com a URL
        String endereco = "https://www.omdbapi.com/?t=" + busca + "&apikey=" + chaveAPI;

        // Design Patterns (padrões de projeto)
        HttpClient client = HttpClient.newHttpClient();

        // .newBuilder() = ferramenta para montar/configurar um objeto
        // .build() = finaliza a montagem e cria/retorna o objeto
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        System.out.println(json);

        // Gson é uma biblioteca do Java usada para converter JSON <-> objetos Java
        Gson gson = new GsonBuilder() // GsonBuilder() define como o Gson vai trabalhar
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE) // Define uma política que cada nome está usando CamelCase
                .create(); // Termina de configurar o Gson
        TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
        System.out.println(meuTituloOmdb);

        Titulo meuTitulo = new Titulo(meuTituloOmdb);
        System.out.println("Título já convertido");
        System.out.println(meuTitulo);
    }
}
