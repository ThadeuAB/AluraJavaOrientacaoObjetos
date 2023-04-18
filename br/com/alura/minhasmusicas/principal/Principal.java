package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("The Odyssey");
        minhaMusica.setCantor("Symphony X");
        minhaMusica.setAlbum("The Odyssey");
        minhaMusica.setGenero("Progressive Metal");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduzir();
        }

        for (int i = 0; i < 500; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Bolha Dev");
        meuPodcast.setApresentador("mr X");

        for (int i = 0; i < 500; i++) {
            meuPodcast.reproduzir();

        }

        for (int i = 0; i < 10; i++) {
            meuPodcast.curte();
        }
        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);
    }


}
