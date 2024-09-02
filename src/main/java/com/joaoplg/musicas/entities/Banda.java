package com.joaoplg.musicas.entities;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "BANDA")
public class Banda extends Entidade {

	@Id
	@Column(name = "PK_BANDA")
	private Integer id;

	@Column(name = "DT_CRIACAO")
	private LocalDate dataCriacao;

	@ManyToOne
	@JoinColumn(name = "FK_ARTISTA")
	private Artista artista;

	@OneToMany(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "FK_BANDA")
	private List<MembrosBanda> membros;

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

	public List<MembrosBanda> getMembros() {
		return membros;
	}

	public void setMembros(List<MembrosBanda> membros) {
		this.membros = membros;
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
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		Banda other = (Banda) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;

		return true;
	}

	@Override
	public String toString() {
		return "Banda [id=" + id + ", dataCriacao=" + dataCriacao + "]";
	}

}
