package model;

import javax.swing.JOptionPane;

public class Restaurante extends Empresa {
    private String tipo;
    private double precomedio;

    public Restaurante() {
    }

    public Restaurante(String tipo, double precomedio) {
        this.tipo = tipo;
        this.precomedio = precomedio;
    }

    public Restaurante(String tipo, double precomedio, String nome, String endereco, String estado, int cep, int fone) {
        super(nome, endereco, estado, cep, fone);
        this.tipo = tipo;
        this.precomedio = precomedio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecomedio() {
        return precomedio;
    }

    public void setPrecomedio(double precomedio) {
        this.precomedio = precomedio;
    }
    
    @Override
    public void leitura() {
        super.leitura();
        setTipo(JOptionPane.showInputDialog("Digite o tipo de comida"));
        setPrecomedio(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço médio")));
    }
    @Override
    public void imprimir() {
        JOptionPane.showMessageDialog
        (null,"Nome: " + getTipo()+"\n"+"Endereço: " + getPrecomedio());
    }
}