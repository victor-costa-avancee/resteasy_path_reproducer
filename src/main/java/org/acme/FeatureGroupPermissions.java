package org.acme;

import io.smallrye.common.annotation.Blocking;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import javax.enterprise.context.RequestScoped;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@RequestScoped
@Tag(name = "Device Feature Permissions")
@Path("/device-features/{featureId}/permissions")
public class FeatureGroupPermissions {


    @POST
    @Path("/")
    @Blocking
    public SomeDTO create(@PathParam("featureId") @Min(1) long featureId, @NotNull @Valid SomeDTO dto) {
        return dto;
    }
}