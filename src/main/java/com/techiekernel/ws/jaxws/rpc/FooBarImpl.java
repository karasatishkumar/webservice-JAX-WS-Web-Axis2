package com.techiekernel.ws.jaxws.rpc;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public class FooBarImpl{

	@WebMethod
	public String callFooBar1(String name) {
		// TODO Auto-generated method stub
		return "FooBar called by " + name;
	}

}
