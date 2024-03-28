package model;

public class PrincipalPlayslist {
	    public static void main(String[] args) {
	       
	        Musica musica1 = new Musica("Nothing Else Matters", "Mettalica", "Gravadora 1");
	        Musica musica2 = new Musica("Let It Be", "The Beatles", "Gravadora 2");
	        Musica musica3 = new Musica("Paint it Black", "The RollingStones", "Gravadora 3");

	        
	        Playlist playlist = new Playlist("João");

	        
	        playlist.adicionarMusica(musica1);
	        playlist.adicionarMusica(musica2);
	        playlist.adicionarMusica(musica3);

	        
	        playlist.tocarMusicaAleatoria();
	    }
	}

