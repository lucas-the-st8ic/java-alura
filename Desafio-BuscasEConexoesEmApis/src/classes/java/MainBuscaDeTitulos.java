package classes.java;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainBuscaDeTitulos {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o titulo de um livro para realizar a busca:");
        var buscaDeTitulos = input.nextLine();
        buscaDeTitulos = buscaDeTitulos.replace(" ", "+");

        String endereco = "https://www.googleapis.com/books/v1/volumes?q=intitle:" +buscaDeTitulos+ "&key=AIzaSyBllZ9OLtQj7vU79hybOgEnzg8_X1trA5A";


        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
