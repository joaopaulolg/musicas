package com.joaoplg.musicas.persistence;

import com.joaoplg.musicas.entities.Artista;

import jakarta.inject.Named;

@Named
public class ArtistaDAO extends GenericDAO<Artista> {

   public ArtistaDAO() {
      super(Artista.class);
   }

}
