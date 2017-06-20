package io.github.jersey.samples.validation;

import javax.validation.Valid;
import javax.validation.executable.ExecutableType;
import javax.validation.executable.ValidateOnExecution;
import javax.ws.rs.BeanParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import static javax.ws.rs.core.Response.Status.OK;

@Path("form")
public class FormController {

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @ValidateOnExecution(type = ExecutableType.NONE)
    public Response formPost(@Valid @BeanParam FormDataBean form) {
        return Response.status(OK).entity(form.toString()).build();
    }

}
