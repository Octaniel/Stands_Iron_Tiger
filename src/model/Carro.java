
package model;

public class Carro {
    private int id;
    private String categoria;
    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private String fabricante;
    private int kilometragem;
    private double preco_aluguer_dia;
    private double preco_venda;
    private String Status;

    public double getPreco_aluguer_dia() {
        return preco_aluguer_dia;
    }

    public void setPreco_aluguer_dia(double preco_aluguer_dia) {
        this.preco_aluguer_dia = preco_aluguer_dia;
    }

    public double getPreco_venda() {
        return preco_venda;
    }

    public void setPreco_venda(double preco_venda) {
        this.preco_venda = preco_venda;
    }

    
    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
    
        public int getKilometragem() {
        return kilometragem;
    }

    public void setKilometragem(int kilometragem) {
        this.kilometragem = kilometragem;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoriaid) {
        this.categoria = categoriaid;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marcaid) {
        this.marca = marcaid;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricanteid) {
        this.fabricante = fabricanteid;
    }
    
}
