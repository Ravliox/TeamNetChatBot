package ro.teamnet.chatbot.controller;

public class Response {
	String sentence;
	float heuristic;
	
	
	Response(String sentence, float heuristic) {
		this.sentence = sentence;
		this.heuristic = heuristic;
	}
}
