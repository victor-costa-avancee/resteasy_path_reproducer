package org.acme;

import io.smallrye.common.annotation.Blocking;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import javax.enterprise.context.RequestScoped;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@RequestScoped
@Tag(name = "Device Features")
@Path("/device-features")
public class DeviceFeatures {


    @POST
    @Blocking
    @Path("/{featureId}/actions")
    public void createAction(@PathParam("featureId") long featureId, @NotNull @Valid SomeDTO actionDto) {
    }
}