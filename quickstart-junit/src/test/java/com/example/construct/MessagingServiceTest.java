package com.example.construct;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import example.quickstart.service.impl.best.MessagingService;
import example.quickstart.service.impl.best.MessagingServiceImpl;
import example.quickstart.service.impl.best.dto.Message;

@RunWith(MockitoJUnitRunner.class)
public class MessagingServiceTest {
 
	MessagingService service = new MessagingServiceImpl();
	
	@Test
	public void logs_messages() throws Exception {
		String msgId = service.publish(new String("hello world"));
		for(Message msg:service.retrieveByMessageId(msgId)) {
			if(msg.getEventType() == 2) {
				assertEquals("hello world", msg.getPayload());
				break;
			}
		}
	}
}
