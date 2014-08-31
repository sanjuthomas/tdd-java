package com.ourownjava.tdd.mockito.capture;

import com.ourownjava.tdd.mockito.capture.EMailSender.Email;

/**
 * 
 * @author Sanju Thomas
 *
 */
public interface EMailService {

	public void send(final Email email);
}
