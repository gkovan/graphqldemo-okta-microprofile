package com.example.demo;

import javax.annotation.security.RolesAllowed;

import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Name;
import org.eclipse.microprofile.graphql.Query;


@GraphQLApi
public class SurfController {

	@RolesAllowed("Everyone")
    @Query("surfReport")
    public SurfConditions getSurfReport(@Name("location") String location) {
        return SurfConditions.getRandom(location);
    }
    
}
