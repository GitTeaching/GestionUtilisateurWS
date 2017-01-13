package org.soa.ws.test;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface GestionUser {
	
	@WebMethod
	public boolean addUser(String pseud, String nom, String prenom, String mail);
	
	@WebMethod
	public ArrayList<User> getUsersByName(String nom);
	
	@WebMethod
	@WebResult(name="isUserAvailable")
	public boolean isUserAvailable(@WebParam(name="userID") String pseudo);
	
	//Opération exercice 2
	@WebMethod
	@WebResult(name="ReuturnedUser")
	public User getUserByID(String pseudo);

}
