package com.joaoplg.musicas;

import java.util.List;

import com.joaoplg.musicas.entities.Album;
import com.joaoplg.musicas.persistence.AlbumDAO;

public class TesteMusicas {

   public static void main(String[] args) {
      AlbumDAO dao = new AlbumDAO();
      List<Album> lista = dao.getAll();
      for (Album album: lista) {
         System.out.println(album);
      }
   }

}
