package com.ourownjava.tdd.mockit;

import javax.naming.AuthenticationException;


/**
 * 
 * @author Sanju Thomas
 *
 */
public class AuthenticationManager {
	
	private ThridPartyAuthenticationService authenticationService;
	
	public void authenticate(final Principal pricipal) throws AuthenticationException{
		if(!authenticationService.authenticate(pricipal)){
			throw new AuthenticationException("I think we haven't met yet! did we?");
		}
	}

}
