package org.soa.ws.test;

import javax.xml.ws.Endpoint;

public class GestionUserPublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:1234/gestionuserws", new GestionUserImpl());
	}

}
