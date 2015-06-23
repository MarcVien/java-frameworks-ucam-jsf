package mbean.aula1;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import aula2.Game;

@ManagedBean
@SessionScoped
/***
 * @author Marcelo
 */
public class GameBean {

    private String nome = "";
   
    private ArrayList<Game> games;

    public GameBean() {
        games = new ArrayList<>();
    }


    public boolean validarFormGame() {

        boolean retorno = true;
        if (nome.isEmpty()) {
            System.out.println("Nome é obrigatório");
            return false;
        }
    
        return retorno;
    }

    public void adicionarGame() {
        Game jogo = new Game();


        if (validarFormGame()) {

            if (games != null) {
                jogo.setNome(nome);
            }
            jogo.setId(Game.idSource++);
            games.add(jogo);
        }
    }


     public void removerTodos() {
        games.removeAll(games);
    }
    
     
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

     public ArrayList<Game> getGames() {
        return games;
    }

    public void setGames(ArrayList<Game> games) {
        this.games = games;
    }
}
