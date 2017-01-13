package org.soa.ws.test;

import java.util.ArrayList;

import javax.jws.WebService;

@WebService(endpointInterface="org.soa.ws.test.GestionUser")
public class GestionUserImpl implements GestionUser{
	
	private ArrayList<User> users;
	
	public GestionUserImpl(){
		users = new ArrayList<User>();
		users.add(new User("@user1","Djebar","Assia","user1@hotmail.com"));
		users.add(new User("@user2","Tamzali","Wassyla","user2@gmail.com"));
		users.add(new User("@user3","Djebar","Imalayene","user3@live.fr"));
	}

	@Override
	public boolean addUser(String pseudo, String nom, String prenom, String mail) {
		User user = new User(pseudo, nom, prenom, mail);
		return users.add(user);
	}

	@Override
	public ArrayList<User> getUsersByName(String nom) {
		ArrayList<User> usersByName = new ArrayList<User>();
		
		for(int i=0; i< users.size(); i++)
			if(nom.equals(users.get(i).getNom()))
				usersByName.add(users.get(i));
		
		return usersByName;
	}

	@Override
	public boolean isUserAvailable(String pseudo) {
		for(int i=0; i< users.size(); i++)
			if(pseudo.equals(users.get(i).getPseudo()))
				return true;
		return false;
	}

	@Override
	public User getUserByID(String pseudo) {
		for(int i=0; i< users.size(); i++)
			if(pseudo.equals(users.get(i).getPseudo()))
				return users.get(i);
		return null;
	}

}
