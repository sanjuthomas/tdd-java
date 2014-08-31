package com.ourownjava.tdd.mockito.captor;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.ourownjava.tdd.mockito.capture.EMailSender;
import com.ourownjava.tdd.mockito.capture.EMailService;

/**
 * 
 * @author Sanju Thomas
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class TestEmailSender {
	
	@Mock
	private EMailService eMailService;

	@InjectMocks
	private EMailSender eMailSender;
	
	@Captor
	private ArgumentCaptor<EMailSender.Email> emailCaptor;
	
	@Before
	public void setUp(){
		
	}
	
	@Test
	public void shouldConstructEmailObjectAndSendEmail(){
		eMailSender.send(new String [] {"test@test.com"}, "test", "mockito argument captor test");
		verify(eMailService).send(emailCaptor.capture());
		assertArrayEquals(new String [] {"test@test.com"}, emailCaptor.getValue().getToAdrresses());
		assertEquals("test", emailCaptor.getValue().getSubject());
		assertEquals("mockito argument captor test", emailCaptor.getValue().getContent());
	}
	
	
}
