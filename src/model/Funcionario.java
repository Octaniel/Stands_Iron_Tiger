package model;

public class Funcionario extends Pessoa {

    private int pessoaid;
    private String status;
    private double salario;
    private String senha;
    private String nome_de_usuario;

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome_de_usuario() {
        return nome_de_usuario;
    }

    public void setNome_de_usuario(String nome_de_usuario) {
        this.nome_de_usuario = nome_de_usuario;
    }
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getPessoaid() {
        return pessoaid;
    }

    public void setPessoaid(int pessoaid) {
        this.pessoaid = pessoaid;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
