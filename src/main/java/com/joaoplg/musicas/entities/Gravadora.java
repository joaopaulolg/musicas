package com.joaoplg.musicas.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="GRAVADORA")
public class Gravadora extends Entidade {

   @Id
   @Column(name="PK_GRAVADORA")
   private Integer id;
   
   @Column(name="NM_GRAVADORA")
   private String nome;

   @Column(name="ANO_FUNDACAO")
   private Integer anoFundacao;

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

   public Integer getAnoFundacao() {
      return anoFundacao;
   }

   public void setAnoFundacao(Integer anoFundacao) {
      this.anoFundacao = anoFundacao;
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
      
      Gravadora other = (Gravadora) obj;
      if (id == null) {
         if (other.id != null) return false;
      } else if (!id.equals(other.id)) return false;
      
      return true;
   }

   @Override
   public String toString() {
      return "Gravadora [id=" + id + ", nome=" + nome + ", anoFundacao=" + anoFundacao + "]";
   }
   
}
