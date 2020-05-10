package com.joaoplg.musicas.persistence;

import javax.inject.Named;

import com.joaoplg.musicas.entities.Artista;

@Named
public class ArtistaDAO extends GenericDAO<Artista> {

   public ArtistaDAO() {
      super(Artista.class);
   }

}
