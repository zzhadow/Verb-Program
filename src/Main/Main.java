package Main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public class Main {


	public static void main(String[] args) {
		
		String verbFormLine;
		
		Collection<VerbForm> verbFormArray = new ArrayList<VerbForm>();
		
		try{
		BufferedReader inFile = new BufferedReader(new FileReader("Verbs.txt"));
		
		while((verbFormLine = inFile.readLine()) !=null ){
			
			String[] verbFormParts = verbFormLine.split(";");
			
			VerbForm verbform = new VerbForm();
			
			verbform.verb = verbFormParts[0];
			verbform.firstPerson = verbFormParts[1];
			verbform.secondPerson = verbFormParts[2];
			verbform.thirdPerson = verbFormParts[3];
			verbform.fourthPerson = verbFormParts[4];
			verbform.fifthPerson = verbFormParts[5];
			verbform.sixthPerson = verbFormParts[6];
			
			verbFormArray.add(verbform);
			
		}
		inFile.close();
		
		}catch(IOException e){
			
			System.err.println("Error " + e);
		}
		
	
	}

}
