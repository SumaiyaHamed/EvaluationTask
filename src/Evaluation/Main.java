package Evaluation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;



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
		String variable=response.body();
		System.out.println("  ");
		
//Write response in a file:
		System.out.println("****************************************************************");
		System.out.println("  ");
		try {

		FileWriter filewriter = new FileWriter("evaluationfile.txt");
		filewriter.write(variable.toString());
		filewriter.close();
		

		FileReader read = new FileReader("evaluationfile.txt");
		BufferedReader buffeRedreader=new BufferedReader(read);
		String line;
		while((line=buffeRedreader.readLine())!=null) {
			System.out.println(line);
		}read.close();
		}catch (IOException e) {
			e.printStackTrace();
		} 
		System.out.println("_____________");
		System.out.println("succuss....");
		System.out.println("_____________");
		System.out.println("  ");
		System.out.println("****************************************************************");

		//Gson gson = new Gson();

	  // TopApi topapi = gson.fromJson(response.body().toString(), TopApi.class);

	}

}
