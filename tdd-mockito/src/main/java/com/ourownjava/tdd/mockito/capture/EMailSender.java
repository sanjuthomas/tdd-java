package com.ourownjava.tdd.mockito.capture;

/**
 * 
 * @author Sanju Thomas
 *
 */
public class EMailSender {
	
	private EMailService emailService;
	
	public void send(final String[] toAddresses, final String subject, final String content){
		emailService.send(new Email(toAddresses, subject, content));
	}
	
	public class Email {
		
		private Email(final String[] toAddresses, final String subject, final String content){
			this.toAdrresses = toAddresses;
			this.subject = subject;
			this.content = content;
		}
		
		private String [] toAdrresses;
		private String subject;
		private String content;
		
		
		public String[] getToAdrresses() {
			return toAdrresses;
		}
		public void setToAdrresses(String[] toAdrresses) {
			this.toAdrresses = toAdrresses;
		}
		public String getSubject() {
			return subject;
		}
		public void setSubject(String subject) {
			this.subject = subject;
		}
		public String getContent() {
			return content;
		}
		public void setContent(String content) {
			this.content = content;
		}
	}

}
