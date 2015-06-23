package aula2;

import java.io.Serializable;

/***
 * 
 * @author Marcelo
 */
public class Game implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7218436701209511574L;
	
	public static int idSource = 0;
	
	private Integer id;
	private String nome;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
