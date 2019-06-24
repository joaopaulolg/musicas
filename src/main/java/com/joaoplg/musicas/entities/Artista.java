package com.joaoplg.musicas.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ARTISTA")
public class Artista extends Entidade {

   @Id
   @Column(name="PK_ARTISTA")
   private Integer id;
   
   @Column(name="NM_ARTISTA")
   private String nome;

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
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
      
      Artista other = (Artista) obj;
      if (id == null) {
         if (other.id != null) return false;
      } else if (!id.equals(other.id)) return false;
      
      return true;
   }

   @Override
   public String toString() {
      return "Artista [id=" + id + ", nome=" + nome + "]";
   }
   
}
