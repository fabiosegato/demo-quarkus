package dev.segato;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;


@Path("/index")
public class templateDemo {

   @Inject
   Template index;
   
   @GET
   @Produces(MediaType.TEXT_HTML)
   
   public TemplateInstance get(@QueryParam("name") String name) {
	return index.data("name", name);
	   
   }
   
}
