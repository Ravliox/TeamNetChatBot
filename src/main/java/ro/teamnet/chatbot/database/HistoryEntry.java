package ro.teamnet.chatbot.database;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HistoryEntry {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String category;
	private String text;
	
	protected HistoryEntry() {}
	
	public HistoryEntry(String category, String text){
		this.category = category;
		this.text = text;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	
	
}
