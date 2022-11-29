package Evaluation;

import java.io.BufferedReader;
import java.io.File;
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
import java.util.StringTokenizer;

import com.google.gson.Gson;

public class Main {

	public static void main(String[] args) throws IOException {
		boolean list=true;
		do {

		Scanner sa = new Scanner(System.in);

		System.out.println("#_#_#_#_#_#_#_#_#_#_#_#_#_#_#_");
		System.out.println("1.multiple Users");
		System.out.println("2.Serch for word");
		System.out.println("3.test");
		System.out.println("#_#_#_#_#_#_#_#_#_#_#_#_#_#_#_");

		System.out.println("Select one option:");
		int Menue = sa.nextInt();

		switch (Menue) {
		case 1:
			
			Nationalize.NationalizeMethod();

			break;
		case 2:
			
			SearchWord.SearchWordString();

			break;
			
//		case 3:
//			
//
//			   int tokencount;
//
//			   FileReader fr=new FileReader("evaluationfile.txt");
//
//			   BufferedReader br=new BufferedReader(fr);
//
//			   String s;
//
//			   int linecount=0;
//
//			   String line;
//
//			   String words[]=new String[500];
//
//			                                while ((s=br.readLine())!=null)
//
//			                                        {
//
//			                                        linecount++;
//
//			                                        int indexfound=s.indexOf("see");
//
//			                                                                     if (indexfound>-1)
//
//			                                                                     {
//
//			 System.out.println("\n");
//
//			 System.out.println("Word was found at position::" +indexfound+ "::on line"+linecount);
//
//			System.out.println("\n");
//
//			 line=s;
//
//			System.out.println(line);
//
//			int idx=0;
//
//			StringTokenizer st= new StringTokenizer(line);
//
//			tokencount= st.countTokens();
//
//			System.out.println("\n");
//
//			System.out.println("Number of tokens found" +tokencount); System.out.println("\n");                                             
//
//			 for (idx=0;idx<tokencount;idx++)                                                                                                    {
//
//			 words[idx]=st.nextToken();
//
//			System.out.println(words[idx]);
//
//			                                                           }
//
//			                                                            }
//
//			                                        }
//
//			   fr.close();
//
//			break;
	
		}

	
	}while(list=true);
		

}
}
