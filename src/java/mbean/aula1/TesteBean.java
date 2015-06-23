package mbean.aula1;

import java.util.Random;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
/***
 * @author Marcelo
 */
public class TesteBean {

	
	private String nome = "";

	private Integer numeroEscolhido = new Random().nextInt(11);
	private Integer papite;
	private String respostaSorte;
	
	public String verificarPalpite(){
		
            if (papite != null){ 
                
                if(papite.equals(numeroEscolhido)){
			respostaSorte = "Muito bem! Você acertou!";
		}else{
			respostaSorte = "Nah!! Errou, o número que pensei foi " + numeroEscolhido;
			numeroEscolhido = new Random().nextInt(11);
		}
            }
		
		
		return null;
		
	}
	
	

	public Integer getNumeroEscolhido() {
		return numeroEscolhido;
	}



	public Integer getPapite() {
		return papite;
	}



	public void setPapite(Integer papite) {
		this.papite = papite;
	}

	


	public void setNumeroEscolhido(Integer sorte) {
		this.numeroEscolhido = sorte;
	}



	public String getRespostaSorte() {
		return respostaSorte;
	}



	public void setRespostaSorte(String respostaSorte) {
		this.respostaSorte = respostaSorte;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
