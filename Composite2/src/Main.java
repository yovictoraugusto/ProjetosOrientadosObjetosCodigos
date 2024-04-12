import java.util.*;

public class Main {
    public static void main(String[] args) {
        Artigo artigo = new Artigo();
        artigo.setNome("Ola");
        artigo.addAutor("Victor");
        artigo.addAutor("Augusto");

        Artigo artigo2 = new Artigo();
        artigo2.setNome("Teste");
        artigo2.addAutor("Victor");
        artigo2.addAutor("Augusto");

        Artigo artigo3 = new Artigo();
        artigo3.setNome("Hello");
        artigo3.addAutor("Yuri");
        artigo3.addAutor("Baldi");

        Revista revista = new Revista();
        revista.setNome("Revista + vc");
        revista.addArtigo(artigo);

        Caderno caderno = new Caderno();
        caderno.setNome("A4");
        caderno.addPublicao(revista);
        caderno.addPublicao(artigo2);

        Jornal jornal = new Jornal();
        jornal.setNome("Globo");
        jornal.addPublicao(artigo3);
        jornal.addPublicao(caderno);

        System.out.println("Artigos");
        System.out.println(artigo.toString());
        System.out.println(artigo2.toString());
        System.out.println(artigo3.toString());

        System.out.println("\nRevista");
        System.out.println(revista.toString());
        System.out.println("Artigos: "+ revista.getCount());
        System.out.println(revista.getPublicacoes());

        System.out.println("\n\nCaderno");
        System.out.println(caderno.toString());
        System.out.println("Publicacoes: "+ caderno.getCount());
        System.out.println(caderno.getPublicacoes());

        System.out.println("\n\nJornal");
        System.out.println(jornal.toString());
        System.out.println("Publicacoes: "+jornal.getCount());
        System.out.println(jornal.getPublicacoes());
    }
}