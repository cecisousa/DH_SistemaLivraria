package br.digitalhouse.DesafioDH01;

public class Principal {

    public static void main(String[] args) {

        Livro livro1 = new Livro("L001", "Dom Casmurro", "Machado de Assis", 1900d, 100d, 4, 30.00f);
        Livro livro2 = new Livro("L002", "Harry Potter", "JK Rowling", 2000d, 200d, 0, 50.00f);
        Livro livro3 = new Livro("L003", "Orgulho e Preconceito", "Jane Austen", 1800d, 300d, 10, 20.00f);
        Livro livro4 = new Livro("L004", "Hamlet", "Shakespeare", 1700d, 400d, 1, 60.00f);

        Vendedor atencioso = new Vendedor();

        atencioso.cadastraLivro(livro1);
        atencioso.cadastraLivro(livro2);
        atencioso.cadastraLivro(livro3);
        atencioso.cadastraLivro(livro4);

        atencioso.consultaCodigo("L001");
        atencioso.consultaCodigo("L005");

        atencioso.efetuaVenda("L001");
        atencioso.efetuaVenda("L002");
        atencioso.efetuaVenda("L003");
        atencioso.efetuaVenda("L004");
        atencioso.efetuaVenda("L004");
        atencioso.efetuaVenda("L005");


    }
}
