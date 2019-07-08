
package model;

import java.util.Date;

public class Devolucao {
    private int id;
    private String nomecliente;
    private int numerocliente;
    private String placacarro;
    private String marcacarro;
    private Date datafinal;
    private String horafinal;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomecliente() {
        return nomecliente;
    }

    public void setNomecliente(String nomecliente) {
        this.nomecliente = nomecliente;
    }

    public int getNumerocliente() {
        return numerocliente;
    }

    public void setNumerocliente(int numerocliente) {
        this.numerocliente = numerocliente;
    }

    public String getPlacacarro() {
        return placacarro;
    }

    public void setPlacacarro(String placacarro) {
        this.placacarro = placacarro;
    }

    public String getMarcacarro() {
        return marcacarro;
    }

    public void setMarcacarro(String marcacarro) {
        this.marcacarro = marcacarro;
    }

    public Date getDatafinal() {
        return datafinal;
    }

    public void setDatafinal(Date datafinal) {
        this.datafinal = datafinal;
    }

    public String getHorafinal() {
        return horafinal;
    }

    public void setHorafinal(String horafinal) {
        this.horafinal = horafinal;
    }
    
}
