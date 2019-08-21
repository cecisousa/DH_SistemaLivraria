package br.digitalhouse.DesafioDH01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vendedor {

    private List<Livro> livrosCadastrados = new ArrayList<>();

    public void cadastraLivro(Livro umLivro) {
        livrosCadastrados.add(umLivro);
        System.out.println("Cadastro realizado!");
    }

    public void consultaCodigo(String codigo){
        for (int i = 0; i < livrosCadastrados.size(); i++) {
            if (livrosCadastrados.get(i).getCodigo().equals(codigo)){
                System.out.println("Livro disponível! " + livrosCadastrados.get(i).toString());
                return;
            }
        }
        System.out.println("Livro não encontrado, que pena!");
    }

    public void efetuaVenda(String codigo){
        for (int i = 0; i < livrosCadastrados.size(); i++) {
            if(livrosCadastrados.get(i).getCodigo().equals(codigo)){
                if(livrosCadastrados.get(i).getQtdEstoque() > 0){
                    livrosCadastrados.get(i).tiraDoEstoque();
                    System.out.println("Compra efetuada!");
                } else {
                    System.out.println("Estoque esgotado, volte semana que vem!");
                }
                return;
            }
        }
        System.out.println("Desculpe, não trabalhamos com esse livro.");
    }
}


