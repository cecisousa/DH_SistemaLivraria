package br.digitalhouse.DesafioDH01;

import java.util.ArrayList;
import java.util.List;

public class Livro {

    private String codigo;
    private String titulo;
    private String autor;
    private Double anoLancamento;
    private Double codigoISBN;
    private Integer qtdEstoque;
    private Float preco;
    private List<Livro> livrosCadastrados = new ArrayList<>();

    public Livro(String novoCodigo, String novoTitulo, String novoAutor, Double novoAnoLancamento, Double novoCodigoISBN, Integer novaQtdEstoque, Float novoPreco){
        codigo = novoCodigo;
        titulo = novoTitulo;
        autor = novoAutor;
        anoLancamento = novoAnoLancamento;
        codigoISBN = novoCodigoISBN;
        qtdEstoque = novaQtdEstoque;
        preco = novoPreco;
    }

    public void tiraDoEstoque(){
        qtdEstoque -= 1;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "codigo='" + codigo + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoLancamento=" + anoLancamento +
                ", codigoISBN=" + codigoISBN +
                ", qtdEstoque=" + qtdEstoque +
                ", preco=" + preco +
                '}';
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Double getAnoLancamento() {
        return anoLancamento;
    }

    public Double getCodigoISBN() {
        return codigoISBN;
    }

    public Integer getQtdEstoque() {
        return qtdEstoque;
    }

    public Float getPreco() {
        return preco;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnoLancamento(Double anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setCodigoISBN(Double codigoISBN) {
        this.codigoISBN = codigoISBN;
    }

    public void setQtdEstoque(Integer qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

}
