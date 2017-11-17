//package ro.teamnet.chatbot;
//
//import ro.teamnet.chatbot.database.*;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.ApplicationArguments;
//import org.springframework.boot.ApplicationRunner;
//import org.springframework.stereotype.Component;
//
//
//@Component
//public class LoadDB implements ApplicationRunner {
//	
//	@Autowired
//	private HistoryRepository repository;
//
//	@Override
//	public void run(ApplicationArguments arg0) throws Exception {
//		repository.save(new HistoryEntry("Stefan cel Mare", "Stefan cel Mare a domnit intre anii 1457 si 1504. Stefan cel Mare a domnit 47 de ani. Stefan cel Mare a purtat 40 de batalii. Stefan cel Mare a avut 20 de copii. Pe sotia lui Stefan cel Mare o chema Maria Voichita. Stefan cel Mare s-a nascut in anul 1532. Stefan cel Mare a murit in anul 1504."));
//		repository.save(new HistoryEntry("Mihai Viteazul", "Mihai Viteazul a domnit intre anii 1593 si 1600. Mihai Viteazul a domnit timp de 7 ani. Mihai Viteazul a purtat 20 de batalii. Mihai Viteazul a avut 0 copii. Pe sotia lui Mihai Viteazul o chema Maria Magdalena. Mihai Viteazul s-a nascut in anul 1558. Mihai Viteazul a murit in anul 1600."));
//	}
//	
//}
