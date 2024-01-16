import java.net.URI;
import java.net.http.*;
import java.net.http.HttpResponse.BodyHandlers;
public class ImdbApi {

	public static void main(String[] args) {
		System.out.println("Uma exemplo de consumo de api");
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder()
		      .uri(URI.create("https://economia.awesomeapi.com.br/last/USD-BRL,EUR-BRL,BTC-BRL"))
		      .build();
		client.sendAsync(request, BodyHandlers.ofString())
		      .thenApply(HttpResponse::body)
		      .thenAccept(System.out::println)
		      .join();
	}

	

	

	

	

}
