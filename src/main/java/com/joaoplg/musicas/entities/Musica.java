package com.joaoplg.musicas.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="MUSICA")
public class Musica extends Entidade {

   @Id
   @Column(name="PK_MUSICA")
   private Integer id;
   
   @Column(name="NM_MUSICA")
   private String nome;
   
   @Column(name="NR_ORDEM")
   private Integer ordem;
   
   @Column(name="NR_DISCO")
   private Integer numeroDisco;
   
   @Column(name="NR_DURACAO")
   private Integer duracao;
   
   @ManyToOne
   @JoinColumn(name="FK_ARTISTA")
   private Artista artista;

   @ManyToOne
   @JoinColumn(name="FK_ALBUM")
   private Album album;

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

   public Integer getOrdem() {
      return ordem;
   }

   public void setOrdem(Integer ordem) {
      this.ordem = ordem;
   }

   public Integer getNumeroDisco() {
      return numeroDisco;
   }

   public void setNumeroDisco(Integer numeroDisco) {
      this.numeroDisco = numeroDisco;
   }

   public Integer getDuracao() {
      return duracao;
   }

   public void setDuracao(Integer duracao) {
      this.duracao = duracao;
   }

   public Artista getArtista() {
      return artista;
   }

   public void setArtista(Artista artista) {
      this.artista = artista;
   }

   public Album getAlbum() {
      return album;
   }

   public void setAlbum(Album album) {
      this.album = album;
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
      
      Musica other = (Musica) obj;
      if (id == null) {
         if (other.id != null) return false;
      } else if (!id.equals(other.id)) return false;
      
      return true;
   }

   @Override
   public String toString() {
      return "Musica [id=" + id + ", nome=" + nome + ", ordem=" + ordem + ", numeroDisco=" + numeroDisco + ", duracao=" + duracao + "]";
   }

}
