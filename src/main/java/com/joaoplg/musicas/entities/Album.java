package com.joaoplg.musicas.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="ALBUM")
public class Album extends Entidade {

   @Id
   @Column(name="PK_ALBUM")
   private Integer id;
   
   @Column(name="NM_ALBUM")
   private String nome;
   
   @Column(name="ST_COLETANEA")
   private Boolean coletanea;
   
   @Column(name="DT_LANCAMENTO")
   private LocalDate dataLancamento;
   
   @ManyToOne
   @JoinColumn(name="FK_ARTISTA")
   private Artista artista;

   @ManyToOne
   @JoinColumn(name="FK_ESTILO")
   private Estilo estilo;

   @ManyToOne
   @JoinColumn(name="FK_PRODUTOR")
   private Artista produtor;

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

   public Boolean getColetanea() {
      return coletanea;
   }

   public void setColetanea(Boolean coletanea) {
      this.coletanea = coletanea;
   }

   public LocalDate getDataLancamento() {
      return dataLancamento;
   }

   public void setDataLancamento(LocalDate dataLancamento) {
      this.dataLancamento = dataLancamento;
   }

   public Artista getArtista() {
      return artista;
   }

   public void setArtista(Artista artista) {
      this.artista = artista;
   }

   public Estilo getEstilo() {
      return estilo;
   }

   public void setEstilo(Estilo estilo) {
      this.estilo = estilo;
   }

   public Artista getProdutor() {
      return produtor;
   }

   public void setProdutor(Artista produtor) {
      this.produtor = produtor;
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
      
      Album other = (Album) obj;
      if (id == null) {
         if (other.id != null) return false;
      } else if (!id.equals(other.id)) return false;
      
      return true;
   }

   @Override
   public String toString() {
      return "Album [id=" + id + ", nome=" + nome + ", coletanea=" + coletanea + ", dataLancamento=" + dataLancamento + "]";
   }

}
