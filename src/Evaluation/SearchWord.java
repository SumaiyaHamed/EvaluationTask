package Evaluation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SearchWord {
	
	public static void SearchWordString() throws FileNotFoundException  {
		
		// search from file a string which is user input in java:
		
				Scanner sa=new Scanner(System.in);
				System.out.println("Enter the word to be found");
				String word=sa.next();
				boolean result=false;
				int count=0;
				
				System.out.println("_____________");
				System.out.println("content of the line");
				System.out.println("_____________");
				
				Scanner sa1=new Scanner(new FileInputStream("C:\\Users\\User007\\eclipse-workspace\\EvaluationTask\\evaluationfile.txt"));
				while(sa1.hasNextLine()) {
					String line=sa1.nextLine();
					System.out.println(line);
					if (line.indexOf(word)!=-1) {
						result=true;
						count=count+1;
					}
				}
				System.out.println("_____________");

				if(result) {
					System.out.println("number is:"+count);
			
				}else {
					System.out.println("The word that you want to found is not given");
				}
				
	}

}
