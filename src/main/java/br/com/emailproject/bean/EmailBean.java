package br.com.emailproject.bean;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.emailproject.dto.EmailLayout;
import br.com.emailproject.model.Email;
import br.com.emailproject.service.EmailService;

@Named
@RequestScoped
public class EmailBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private static final String GMAIL_EMAIL_ADM = System.getenv("GMAIL_JAVA_MAIL");
	private static final String GMAIL_EMAIL_ARQ = "michelsigma@gmail.com";
	private static final String ASSUNTO = "E-mail project Java";
			
	@Inject
	private EmailService emailService;
	
	public String enviarEmail() {
		emailService.enviar(montarEmailAdm());
		emailService.enviar(montarEmailArq());
		return null;
	}
	
	private Email montarEmailAdm() {
		EmailLayout emailLayout= new EmailLayout();
		return emailLayout.montarEmailAdministrador(GMAIL_EMAIL_ADM, ASSUNTO);		
	}
	
	private Email montarEmailArq() {
		EmailLayout emailLayout= new EmailLayout();
		return emailLayout.montarEmailAdministrador(GMAIL_EMAIL_ARQ, ASSUNTO);		
	}

}
