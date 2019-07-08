
package model;

import java.util.Date;


public class Pessoa {
    private int id;
    private String nome;
    private String distrito;
    private String zona;
    private Date data_de_nascimento;
    private long telefone;
    private String genero;

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
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

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distritoid) {
        this.distrito = distritoid;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zonaid) {
        this.zona = zonaid;
    }

    public Date getData_de_nascimento() {
        return data_de_nascimento;
    }

    public void setData_de_nascimento(Date data_de_nascimento) {
        this.data_de_nascimento = data_de_nascimento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
}
