package com.server;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import com.domain.User;
import com.sun.jersey.spi.resource.Singleton;



/**
 * @author Kishor
 *
 */
@Singleton
@Path("services")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SalesSoftRestServices {
	 
	private static final Logger LOGGER = Logger.getLogger(SalesSoftRestServices.class);
	
	
	@POST
    @Path("registerUser")
    public String registerUser(User user) throws JSONException {
        LOGGER.info("Calling registerUser()");
        JSONObject submitStatus = new JSONObject();
        //save User
        	if(DataManager.addUser(user)){
               submitStatus.put("status", "SUCCESS");
            } else {
                submitStatus.put("status", "ERROR");
            }
        
        return submitStatus.toString();
    }

}
