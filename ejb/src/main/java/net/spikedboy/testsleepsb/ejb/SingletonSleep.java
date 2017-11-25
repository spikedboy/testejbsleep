package net.spikedboy.testsleepsb.ejb;

import javax.ejb.Local;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Local
@Path("/singleton/")
public interface SingletonSleep {
    @GET
    @Produces("text/plain")
    @Path("sleep")
    String sleep();
}
