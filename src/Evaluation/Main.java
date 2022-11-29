package Evaluation;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import com.google.gson.Gson;



public class Main {

	public static void main(String[] args) throws FileNotFoundException {
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
		String task=response.body();
		System.out.println("  ");
		
//Write response in a file:
		System.out.println("****************************************************************");
		System.out.println("  ");
		try {

		FileWriter filewriter = new FileWriter("evaluationfile.txt");
		filewriter.write(task.toString());
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
		System.out.println("  ");
		
		//search from file a string which is user input in java:
		Scanner sa=new Scanner(System.in);
		System.out.println("Enter the word to be found");
		String word=sa.next();
		boolean result=false;
		int count=0;
		System.out.println("contentof the line");
		Scanner sa1=new Scanner(new FileInputStream("C:\\Users\\User007\\eclipse-workspace\\EvaluationTask\\evaluationfile.txt"));
		while(sa1.hasNextLine()) {
			String line=sa1.nextLine();
			System.out.println(line);
			if (line.indexOf(word)!=-1) {
				result=true;
				count=count+1;
			}
		}
		if(result) {
			System.out.println("number is:"+count);
	
		}else {
			System.out.println("nathing:");
		}
		
		
		
		//Gson gson = new Gson();

	  // TopApi topapi = gson.fromJson(response.body().toString(), TopApi.class);

	}

}
