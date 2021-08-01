package com.joaoplg.musicas.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.joaoplg.musicas.entities.Banda;
import com.joaoplg.musicas.entities.MembrosBanda;
import com.joaoplg.musicas.persistence.BandaDAO;
import com.joaoplg.musicas.persistence.MembrosBandaDAO;

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
