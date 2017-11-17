package ro.teamnet.chatbot.controller;

import java.util.ArrayList;

public class Interpreter {
	
	private Querier qr;
	private ArrayList<String> key_words;
	private Response[] responses;
	
	Interpreter () {
		qr = new Querier();
	}
	
	boolean ExtractQuestion (String question) {
		
		String[] tokens = question.split("[ \\?]");
		key_words = new ArrayList<>(tokens.length);
		if (Prepositions.IsPrep(tokens[0]) == false && question.charAt(question.length() - 1) != '?'){
			return false;
		}
		for (String token : tokens){
			if (Prepositions.IsPrep(token) == false) {
				key_words.add(token);
			}
		}
		
		for (String token : key_words) {
			System.out.println(token);
		}
		return true;
	}
	
	void ExtractDBQuery (){
		
		String text = qr.Query(key_words);
		System.out.println(text);
		responses = new Response[4];
		int contor = 0;
		String[] sentences = text.split("\\. ");
		
		for (String s : sentences){
			String[] t = s.split("\\.");
			float h = Heuristic(t[0]);
			if (h >= 80){
				responses[contor] = new Response(t[0], h);
				if (responses[contor].heuristic > responses[0].heuristic){
					Response res_aux = responses[contor];
					responses[contor] = responses[0];
					responses[0] = res_aux;
				}
				contor++;
			}
		}
	}
	
	float Heuristic (String sentence) {
		String[] text_words = sentence.split(" ");
		int matching_words = 0;
		float percentage;
		for (String key_word : key_words){
			for (String t_word : text_words) {
				if (!Prepositions.IsPrep(t_word)){
					int i = 0;
					while (key_word.charAt(i) == t_word.charAt(i) && i < key_word.length() - 1){
						i++;
					}
					if (i >=  2 * key_word.length() / 3){
						matching_words += 1;
						break;
					}
				}
			}
		}
		percentage = matching_words * 100 / key_words.size();
		return percentage;
	}
	
	Response[] Interpretate (String question){
		
		boolean questionIsValidated = ExtractQuestion(question);
		if (!questionIsValidated){
			return null;
		}
		ExtractDBQuery();
		
		return responses;
	}
}
