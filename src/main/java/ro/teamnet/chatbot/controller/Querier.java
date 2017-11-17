package ro.teamnet.chatbot.controller;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;



import ro.teamnet.chatbot.database.*;
public class Querier {
	BufferedReader in;
	List<HistoryEntry> results;
	Enumeration<String> subjects;
	Database db;
	String result;
	String query;
	
	
	Querier(){
		db = new Database();
		subjects = db.database.keys();
	}
	
	String Query(ArrayList<String> key_words){
		for (int i = 0; i < key_words.size() - 1; i++)
		{
			String aux = key_words.get(i);
			subjects = db.database.keys(); 
			while (subjects.hasMoreElements()){
				String s = subjects.nextElement();
				String[] tokens = s.split(" ");
				System.out.println(aux + " " + s);

				if (tokens[0].equals(aux)) {
					return db.database.get(s);
				}
			}
		}
		
		return null;
	}
	
	
}
