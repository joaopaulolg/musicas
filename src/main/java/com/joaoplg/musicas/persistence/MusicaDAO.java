package com.joaoplg.musicas.persistence;

import com.joaoplg.musicas.entities.Musica;

public class MusicaDAO extends GenericDAO<Musica> {

   public MusicaDAO() {
      super(Musica.class);
   }

}
