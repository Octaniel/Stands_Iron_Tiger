
package model;

public class Empresa {
    private int id;
    private String nome;
    private String zona;
    private String Distrito;
    private int nfuncionarios;

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

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getDistrito() {
        return Distrito;
    }

    public void setDistrito(String Distrito) {
        this.Distrito = Distrito;
    }

    public int getNfuncionarios() {
        return nfuncionarios;
    }

    public void setNfuncionarios(int nfuncionarios) {
        this.nfuncionarios = nfuncionarios;
    }
    
}
