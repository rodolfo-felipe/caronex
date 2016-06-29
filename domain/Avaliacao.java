package main.java.br.com.caronex.domain;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Avaliacao {
	
	private Long nota;
	private String comentario;
	
	public Long getNota() {
		return nota;
	}

	public void setNota(Long nota) {
		this.nota = nota;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

}
