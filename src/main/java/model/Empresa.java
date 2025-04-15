package model;

import javax.swing.JOptionPane;

public class Empresa {
    private String nome;
    private String endereco;
    private String cidade;
    private String estado;
    private int cep;
    private int fone;

    public Empresa() {
    }

    public Empresa(String nome, String endereco, String estado, int cep, int fone) {
        this.nome = nome;
        this.endereco = endereco;
        this.estado = estado;
        this.cep = cep;
        this.fone = fone;
    }  

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public int getFone() {
        return fone;
    }

    public void setFone(int fone) {
        this.fone = fone;
    }

    public void leitura() {
        setNome(JOptionPane.showInputDialog("Digite o nome"));
        setEndereco(JOptionPane.showInputDialog("Digite o endereço"));
        setCidade(JOptionPane.showInputDialog("Digite a cidade"));
        setEstado(JOptionPane.showInputDialog("Digite o Estado"));
        setCep(Integer.parseInt(JOptionPane.showInputDialog("Digite o CEP")));
        setFone(Integer.parseInt(JOptionPane.showInputDialog("Digite o telefone")));
    }
    public void imprimir() {
        JOptionPane.showMessageDialog
        (null,"Nome: " + getNome()+"\n"+"Endereço: " + getEndereco()
        +"\n"+"Cidade: " + getCidade()
        +"\n"+"Estado: " + getEstado()
        +"\n"+"CEP: " + getCep()
        +"\n"+"Telefone: " + getFone());
    }
}
