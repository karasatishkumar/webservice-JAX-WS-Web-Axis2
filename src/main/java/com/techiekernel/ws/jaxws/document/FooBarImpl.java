package com.techiekernel.ws.jaxws.document;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class FooBarImpl{

	public String callFooBar(String name) {
		// TODO Auto-generated method stub
		return "FooBar called by " + name;
	}

	public Server getServerDetail(String client) {
		// TODO Auto-generated method stub
		Server server = new Server();
		server.setName("Techie Kernel");
		server.setIp("192.168.1.0");
		server.setMac("12-75-61-09-12-22");
		server.setOs("Ubuntu");
		return server;
	}
}
