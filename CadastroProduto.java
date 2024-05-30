import java.util.Scanner;
import java.util.ArrayList;


public class CadastroProduto {

    ArrayList cadastroProduto = new ArrayList();

    private String nome;
    private String modelo;
    private String tamanho;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        cadastroProduto.add(nome);
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        cadastroProduto.add(modelo);
        this.modelo = modelo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        cadastroProduto.add(tamanho);
        this.tamanho = tamanho;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        cadastroProduto.add(preco);
        this.preco = preco;
    }


    

}