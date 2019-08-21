package br.digitalhouse.DesafioDH01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vendedor {

    private ArrayList<Livro> livrosCadastrados = new ArrayList<>();

    public void cadastraLivro(Livro umLivro) {
        livrosCadastrados.add(umLivro);
        System.out.println("Cadastro realizado!");
    }

//    public void consultaLivro(String codigo){
//        for (int i = 0; i < livrosCadastrados.size(); i++) {
//            if (codigo.contains(livrosCadastrados)){
//                System.out.println(i);
//            }
//        }
//    }
    public void consultarLivro(Livro livro){
        if(livrosCadastrados.contains(livro)){
            System.out.println("O livro está listado.");
        }else{
            System.out.println("O Livro não foi encontrado");
        }
    }

    public void efetuaVenda(Livro livro){
//        fazer if else de qtidade, subtraindo
    }

}


