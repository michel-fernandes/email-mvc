package br.com.emailproject.dto;

import br.com.emailproject.model.Email;

public class EmailLayout {

	private static final String QUEBRA_DE_LINHA_DUPLA = "<br><br>";
	private static final String QUEBRA_DE_LINHA = "<br>";
	
	public Email montarEmailAdministrador(String destinatario, String assunto) {
		
		StringBuilder texto = new StringBuilder();
		
		texto
			.append("A/C Adminitrador")
			.append(QUEBRA_DE_LINHA_DUPLA);
		
		texto
			.append("Solicito a revisão do projeto de e-mail Java!")
			.append(QUEBRA_DE_LINHA_DUPLA);
		
		gerarAssinatura(texto);
		
		gerarRodape(texto);	
		
		return new Email(destinatario, assunto, texto.toString());		
//		
	}
	
	public Email montarEmailArquiteto(String destinatario, String assunto) {
		
		StringBuilder texto = new StringBuilder();
		
		texto
			.append("A/C Arquiteto")
			.append(QUEBRA_DE_LINHA_DUPLA);
		
		texto
			.append("Solicito a revisão do projeto de e-mail Java!")
			.append(QUEBRA_DE_LINHA_DUPLA);
		
		gerarAssinatura(texto);
		
		gerarRodape(texto);	
		
		return new Email(destinatario, assunto, texto.toString());		
//		
	}
	
	private String gerarAssinatura(StringBuilder texto) {
		return texto
				.append("Att.")
				.append(QUEBRA_DE_LINHA)
				.append("Programador")
				.append(QUEBRA_DE_LINHA_DUPLA).toString();
		
	}

	private String gerarRodape(StringBuilder texto) {
		return texto
				.append("E-mail automático. Favor não responder esse e-mail!")
				.toString();
	}
}
