/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.haint.test.service.interceptor.restassured;

import com.haint.test.service.interceptor.restassured.interceptor.NumberValidation;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.PathParam;

/**
 * REST Web Service
 *
 * @author Hai Nguyen (hai.nguyentrung2@vn.bosch.com)
 */
@RequestScoped
@Path("divide")
public class DivideNumberService {

    @Context
    private UriInfo context;

    /**
     * Retrieves representation of an instance of com.haint.test.service.interceptor.restassured.DivideNumberService
     * @return an instance of java.lang.String
     */
    @GET
    @Path("/{num1}/{num2}")
    @Produces({MediaType.APPLICATION_JSON})
    @NumberValidation
    public String getXml(@PathParam("num1") int num1, @PathParam("num2") int num2) {
        return String.valueOf(((float) num1)/num2);
    }

    /**
     * PUT method for updating or creating an instance of DivideNumberService
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putXml(String content) {
    }
}
