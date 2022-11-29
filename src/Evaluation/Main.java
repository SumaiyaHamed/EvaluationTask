package Evaluation;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;



public class Main {

	public static void main(String[] args) {
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://api.nationalize.io/?name=nathanial"))
				.method("GET", HttpRequest.BodyPublishers.noBody()).build();
		HttpResponse<String> response = null;
		try {
			response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
		}

		System.out.println(response.body());

		//Gson gson = new Gson();

		//TopApi topapi = gson.fromJson(response.body().toString(), TopApi.class);

	}

}