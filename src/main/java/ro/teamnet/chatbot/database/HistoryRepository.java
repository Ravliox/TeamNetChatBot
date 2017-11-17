package ro.teamnet.chatbot.database;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface HistoryRepository extends CrudRepository<HistoryEntry, Long> {
	List<HistoryEntry> findByCategory(String category);
}
