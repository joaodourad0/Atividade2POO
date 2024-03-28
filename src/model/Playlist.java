package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Playlist {
    
    private List<Musica> musicas;
    private String proprietarioPlaylist;

 
    public Playlist(String proprietarioPlaylist) {
        this.proprietarioPlaylist = proprietarioPlaylist;
        this.musicas = new ArrayList<>();
    }

    
    public void adicionarMusica(Musica musica) {
        musicas.add(musica);
    }

   
    public void tocarMusicaAleatoria() {
        if (musicas.isEmpty()) {
            System.out.println("A playlist está vazia.");
            return;
        }

        Random random = new Random();
        int indiceAleatorio = random.nextInt(musicas.size());
        Musica musicaAleatoria = musicas.get(indiceAleatorio);
        System.out.println("Tocando música: " + musicaAleatoria.getNome());
    }
}