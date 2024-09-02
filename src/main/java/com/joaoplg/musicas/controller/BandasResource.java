package com.joaoplg.musicas.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import com.joaoplg.musicas.entities.Banda;
import com.joaoplg.musicas.entities.MembrosBanda;
import com.joaoplg.musicas.persistence.BandaDAO;
import com.joaoplg.musicas.persistence.MembrosBandaDAO;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("bandas")
public class BandasResource {

    private static final String MSG_ERRO_ADICIONA_BANDA = "Erro ao adicionar a banda: ";
    
    @Inject
    private BandaDAO dao;
    
    @Inject
    private MembrosBandaDAO daoMembros;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Banda> getBandas() {
        return dao.getAll();
    }
    
    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Banda getBanda(@PathParam("id") Integer id) {
        return dao.findById(id);
    }
    
    @GET
    @Path("{id}/membros")
    @Produces(MediaType.APPLICATION_JSON)
    public List<MembrosBanda> getMembrosBanda(@PathParam("id") Integer id) {
        return daoMembros.getMembros(id);
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response adicionarBanda(Banda banda) {
        try {
            dao.persistir(banda);
            return Response.created(new URI("")).build();
        } catch (URISyntaxException e) {
            return Response.serverError().entity(MSG_ERRO_ADICIONA_BANDA + e.getMessage()).build();
        }
    }
    
    @PUT
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response atualizarBanda(@PathParam("id") Integer id, Banda banda) {
        dao.atualizar(banda);
        return Response.ok().build();
    }
    
    @DELETE
    @Path("{id}")
    public Response excluirBanda(@PathParam("id") Integer id) {
        dao.remover(id);
        return Response.ok().build();
    }
    
}
