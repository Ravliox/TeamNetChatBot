package ro.teamnet.chatbot.controller;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Session {
	String question;
	String response;
	BufferedReader br;
	Interpreter ir;
	Response[] responses;
	
	Session () throws FileNotFoundException {
		ir = new Interpreter ();
		br = new BufferedReader(new InputStreamReader(System.in));
	}
	
	void listen () throws IOException {
		question = "";
		while (true){
			 question = br.readLine();
			 System.out.println(question);
			 responses = ir.Interpretate(question);
			 if (responses == null) {
				 System.out.println("Asta nu a fost o intrebare!");
			 }
			 else {
				System.out.println("-----------------------------------");
			 	for (Response r : responses) {
				 	if (r != null)
					 	System.out.println(r.sentence + " " + r.heuristic);
			 	}
			 }
		}
	}

}
