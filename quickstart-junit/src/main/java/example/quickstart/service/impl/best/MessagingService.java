package example.quickstart.service.impl.best;

import java.util.List;

import example.quickstart.service.impl.best.dto.Message;

public interface MessagingService {
	String publish(Object message);
	List<Message> retrieveByMessageId(String jmsMessageId);
}
