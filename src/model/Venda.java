package model;

import java.util.Date;

public class Venda {

    private int id;
    private String nome_do_cliente;
    private String placa_de_carro;
    private Date data_inicial;
    private String hora_inicial;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome_do_cliente() {
        return nome_do_cliente;
    }

    public void setNome_do_cliente(String nome_do_cliente) {
        this.nome_do_cliente = nome_do_cliente;
    }

    public String getPlaca_de_carro() {
        return placa_de_carro;
    }

    public void setPlaca_de_carro(String placa_de_carro) {
        this.placa_de_carro = placa_de_carro;
    }

    public Date getData_inicial() {
        return data_inicial;
    }

    public void setData_inicial(Date data_inicial) {
        this.data_inicial = data_inicial;
    }

    public String getHora_inicial() {
        return hora_inicial;
    }

    public void setHora_inicial(String hora_inicial) {
        this.hora_inicial = hora_inicial;
    }

}
