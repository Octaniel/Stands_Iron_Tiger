
package model;

public class Cliente extends Pessoa {
     

    
    private String email;
    private int documento_de_identificacao;
    private String pais;
    private String tipo_de_cliente;
    private String tipo_de_documento;
    
    
    public String getTipo_de_documento() {
        return tipo_de_documento;
    }

    public void setTipo_de_documento(String tipo_de_documento) {
        this.tipo_de_documento = tipo_de_documento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDocumento_de_identificacao() {
        return documento_de_identificacao;
    }

    public void setDocumento_de_identificacao(int documento_de_identificacao) {
        this.documento_de_identificacao = documento_de_identificacao;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTipo_de_cliente() {
        return tipo_de_cliente;
    }

    public void setTipo_de_cliente(String tipo_de_cliente) {
        this.tipo_de_cliente = tipo_de_cliente;
    }

   
    
}
