/**
 * 
 */
package com.opencodez.util.email;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.opencodez.util.ApplicationLogger;

/**
 * @author pavan.solapure
 *
 */
@Service
public class EmailService {
	
	@Autowired
	private JavaMailSender mailSender;

	private static final ApplicationLogger logger = ApplicationLogger.getInstance();
	
	public void send(Email eParams) {

		if (eParams.isHtml()) {
			try {
				sendHtmlMail(eParams);
			} catch (MessagingException e) {
				logger.error("Could not send email to : {} Error = {}", eParams.getToAsList(), e.getMessage());
			}
		} else {
			sendPlainTextMail(eParams);
		}

	}

	private void sendHtmlMail(Email eParams) throws MessagingException {

		boolean isHtml = true;

		MimeMessage message = mailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message,true);
		helper.setTo(eParams.getTo().toArray(new String[eParams.getTo().size()]));
		helper.setReplyTo(eParams.getFrom());
		helper.setFrom(eParams.getFrom());
		helper.setSubject(eParams.getSubject());
		helper.setText(eParams.getMessage(), isHtml);
	
		FileSystemResource file = new FileSystemResource("C:/Users/Pedro/workspace24/EmailService/src/main/java/com/opencodez/util/email/EmailService.java");
		helper.addAttachment(file.getFilename(), file);


		if (eParams.getCc().size() > 0) {
			helper.setCc(eParams.getCc().toArray(new String[eParams.getCc().size()]));
		}

		mailSender.send(message);
	}

	private void sendPlainTextMail(Email eParams) {

		SimpleMailMessage mailMessage = new SimpleMailMessage();

		eParams.getTo().toArray(new String[eParams.getTo().size()]);
		mailMessage.setTo(eParams.getTo().toArray(new String[eParams.getTo().size()]));
		mailMessage.setReplyTo(eParams.getFrom());
		mailMessage.setFrom(eParams.getFrom());
		mailMessage.setSubject(eParams.getSubject());
		mailMessage.setText(eParams.getMessage());

		if (eParams.getCc().size() > 0) {
			mailMessage.setCc(eParams.getCc().toArray(new String[eParams.getCc().size()]));
		}

		mailSender.send(mailMessage);

	}

}
