package com.joaoplg.musicas.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="BANDA")
public class Banda extends Entidade {

   @Id
   @Column(name="PK_BANDA")
   private Integer id;
   
   @Column(name="DT_CRIACAO")
   private LocalDate dataCriacao;
   
   @ManyToOne
   @JoinColumn(name="FK_ARTISTA")
   private Artista artista;

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public LocalDate getDataCriacao() {
      return dataCriacao;
   }

   public void setDataCriacao(LocalDate dataCriacao) {
      this.dataCriacao = dataCriacao;
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
      
      Banda other = (Banda) obj;
      if (id == null) {
         if (other.id != null) return false;
      } else if (!id.equals(other.id)) return false;
      
      return true;
   }

   @Override
   public String toString() {
      return "Banda [id=" + id + ", dataCriacao=" + dataCriacao + "]";
   }

}
