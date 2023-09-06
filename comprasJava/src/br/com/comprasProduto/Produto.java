package br.com.comprasProduto;

public class Produto implements Comparable<Produto>{

    private String nome;

    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;

    }

    @Override
    public String toString() {
        return this.getNome() + " - (" + getPreco() + ")";
    }


    @Override
    public int compareTo(Produto outroProduto) {
        return Double.valueOf(this.preco).compareTo(Double.valueOf(outroProduto.preco));
    }
}


