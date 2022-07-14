package org.acme;

import io.quarkus.cache.CacheResult;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/alticci")
public class AlticciResource {
    @Inject
    AlticciUseCase alticciUseCase;

    @POST
    @Path("/{n}")
    @CacheResult(cacheName = "calculate-cache")
    public Integer calculate(@PathParam("n") Integer n) {
        return alticciUseCase.calculate(n);
    }
}
