package raven;

import org.apache.commons.mail.*;

public class Notifier {
	
    // Google Mail
    public static final String SMTP_SERVER = "smtp.googlemail.com";
    public static final int SMTP_PORT = 465;
    public static final String FROM_EMAIL = "i@jamiel.net";
    
    public static void sendEmail (String fromName, String toEmail, String subject, String body) {
		try {
			HtmlEmail email = new HtmlEmail();
			email.setHostName(SMTP_SERVER);
			email.setSmtpPort(SMTP_PORT);
			email.setAuthenticator(new DefaultAuthenticator(FROM_EMAIL, "v1ndication!321"));
			email.setSSLOnConnect(true);
			email.setFrom(FROM_EMAIL, fromName);
			email.setSubject(subject);			
			email.setHtmlMsg(body);
			email.addTo(toEmail);
			email.send();
		} catch (EmailException e) {
			e.printStackTrace();
		}
    }   
    
    public static void sendEmailWithCC (String fromName, String toEmail, String toCC, String subject, String body) {
		try {
			HtmlEmail email = new HtmlEmail();
			email.setHostName(SMTP_SERVER);
			email.setSmtpPort(SMTP_PORT);
			email.setAuthenticator(new DefaultAuthenticator(FROM_EMAIL, "v1ndication!321"));
			email.setSSLOnConnect(true);
			email.setFrom(FROM_EMAIL, fromName);
			email.setSubject(subject);			
			email.setHtmlMsg(body);
			email.addTo(toEmail);
			email.addCc(toCC);
			email.send();
		} catch (EmailException e) {
			e.printStackTrace();
		}
    }
}
