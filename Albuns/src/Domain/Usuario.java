package Domain;

import java.util.List;

/**
 *
 * @author Ronny
 */
public class Usuario {
    private int id;
    private String nome;
    private String email;
    private String senha;
    private List<FigurinhasNaoAlocadas> figurinhasNaoAlocadas;
    private List<Colecao> colecoes;

    public Usuario() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<FigurinhasNaoAlocadas> getFigurinhasNaoAlocadas() {
        return figurinhasNaoAlocadas;
    }

    public void setFigurinhasNaoAlocadas(List<FigurinhasNaoAlocadas> figurinhasNaoAlocadas) {
        this.figurinhasNaoAlocadas = figurinhasNaoAlocadas;
    }

    public List<Colecao> getColecoes() {
        return colecoes;
    }

    public void setColecoes(List<Colecao> colecoes) {
        this.colecoes = colecoes;
    }
    
    
}