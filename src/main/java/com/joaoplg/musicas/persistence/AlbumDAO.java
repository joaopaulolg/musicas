package com.joaoplg.musicas.persistence;

import com.joaoplg.musicas.entities.Album;

public class AlbumDAO extends GenericDAO<Album> {

   public AlbumDAO() {
      super(Album.class);
   }

}
