import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("knowledge")
public class KbResource {
    KbRepo repo = new KbRepo();

    @POST
    @Path("know")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Knowledge createKnowledge(Knowledge k1) {
        repo.create(k1);
        return k1;
    }
}