package com.joaoplg.musicas.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ARTISTA_INDIVIDUAL")
public class ArtistaIndividual extends Entidade {

   @Id
   @Column(name="PK_ARTISTA_INDIVIDUAL")
   private Integer id;
   
   @Column(name="NM_REAL")
   private String nomeReal;
   
   @Column(name="DT_NASCIMENTO")
   private LocalDate dataNascimento;
   
   @ManyToOne
   @JoinColumn(name="FK_ARTISTA")
   private Artista artista;

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public String getNomeReal() {
      return nomeReal;
   }

   public void setNomeReal(String nomeReal) {
      this.nomeReal = nomeReal;
   }

   public LocalDate getDataNascimento() {
      return dataNascimento;
   }

   public void setDataNascimento(LocalDate dataNascimento) {
      this.dataNascimento = dataNascimento;
   }

   public Artista getArtista() {
      return artista;
   }

   public void setArtista(Artista artista) {
      this.artista = artista;
   }

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((id == null) ? 0 : id.hashCode());
      return result;
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) return true;
      if (obj == null) return false;
      if (getClass() != obj.getClass()) return false;
      
      ArtistaIndividual other = (ArtistaIndividual) obj;
      if (id == null) {
         if (other.id != null) return false;
      } else if (!id.equals(other.id)) return false;
      
      return true;
   }

   @Override
   public String toString() {
      return "ArtistaIndividual [id=" + id + ", nomeReal=" + nomeReal + ", dataNascimento=" + dataNascimento + "]";
   }

}
