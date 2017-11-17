package ro.teamnet.chatbot.controller;

public class Prepositions {

	static final String[] values = {
			"cat",
			"catre",
			"cate",
			"cati",
			"cand",
			"cum",
			"unde",
			"intre",
			"a",
			"asupra",
			"cu",
			"ce",
			"cel",
			"de",
			"din",
			"despre",
			"in",
			"impotriva",
			"dupa",
			"pe",
			"pentru",
			"peste",
			"prin",
			"printre",
			"spre",
			"la",
			"langa",
			"lui",
			"el",
			"ei",
			"sa"
			
	};
	
	
	static boolean IsPrep (String query) {
		query = query.toLowerCase();
		for (String string : values){
			if (string.equals(query)){
				return true;
			}
		}	
		return false;
	}
	
}
