package com.joaoplg.musicas.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ESTILO")
public class Estilo extends Entidade {

   @Id
   @Column(name="PK_ESTILO")
   private Integer id;
   
   @Column(name="NM_ESTILO")
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
      
      Estilo other = (Estilo) obj;
      if (id == null) {
         if (other.id != null) return false;
      } else if (!id.equals(other.id)) return false;
      
      return true;
   }

   @Override
   public String toString() {
      return "Estilo [id=" + id + ", nome=" + nome + "]";
   }

}
