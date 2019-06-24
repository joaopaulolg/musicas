package com.joaoplg.musicas.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="MEMBROS_BANDA")
public class MembrosBanda extends Entidade {

   @Id
   @Column(name="PK_MEMBROS_BANDA")
   private Integer id;
   
   @Column(name="DT_INICIO")
   private LocalDate dataInicio;
   
   @Column(name="DT_FIM")
   private LocalDate dataFim;
   
   @ManyToOne
   @JoinColumn(name="FK_ARTISTA")
   private ArtistaIndividual artistaIndividual;

   @ManyToOne
   @JoinColumn(name="FK_BANDA")
   private Banda banda;

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public LocalDate getDataInicio() {
      return dataInicio;
   }

   public void setDataInicio(LocalDate dataInicio) {
      this.dataInicio = dataInicio;
   }

   public LocalDate getDataFim() {
      return dataFim;
   }

   public void setDataFim(LocalDate dataFim) {
      this.dataFim = dataFim;
   }

   public ArtistaIndividual getArtistaIndividual() {
      return artistaIndividual;
   }

   public void setArtistaIndividual(ArtistaIndividual artistaIndividual) {
      this.artistaIndividual = artistaIndividual;
   }

   public Banda getBanda() {
      return banda;
   }

   public void setBanda(Banda banda) {
      this.banda = banda;
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
      
      MembrosBanda other = (MembrosBanda) obj;
      if (id == null) {
         if (other.id != null) return false;
      } else if (!id.equals(other.id)) return false;
      
      return true;
   }

   @Override
   public String toString() {
      return "MembrosBanda [id=" + id + ", dataInicio=" + dataInicio + ", dataFim=" + dataFim + "]";
   }

}
