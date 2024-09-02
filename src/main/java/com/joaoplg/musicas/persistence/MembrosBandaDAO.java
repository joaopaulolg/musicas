package com.joaoplg.musicas.persistence;

import java.util.List;

import com.joaoplg.musicas.entities.MembrosBanda;

import jakarta.persistence.TypedQuery;

public class MembrosBandaDAO extends GenericDAO<MembrosBanda> {

	private static final String ID_BANDA = "idBanda";

	private static final String GET_MEMBROS_BANDA = "SELECT membros FROM "
			                                      + " com.joaoplg.musicas.entities.MembrosBanda "
			                                      + " WHERE membros.banda.id = :idBanda ";

	public MembrosBandaDAO() {
		super(MembrosBanda.class);
	}

	public List<MembrosBanda> getMembros(Integer idBanda) {
		TypedQuery<MembrosBanda> query = getEntityManager().createQuery(GET_MEMBROS_BANDA, MembrosBanda.class);
		query.setParameter(ID_BANDA, idBanda);
		return query.getResultList();
	}

}
