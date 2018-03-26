package game;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Words {
	private static  ArrayList<String> words = new ArrayList<>();
	
	
	public static ArrayList<String> getWords() {
		return words;
	}


	private Words(){}
	
	
 private void loadWords() {
	File file = new File("word");
	Scanner sc;
	
	try {
		sc = new Scanner(file);
		while(sc.hasNextLine()) {
			words.add(sc.nextLine());
		}
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	
	
}//end class
