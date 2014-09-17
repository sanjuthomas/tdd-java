package com.ourownjava.tdd.jmockit;

import static org.junit.Assert.assertEquals;

import javax.naming.AuthenticationException;

import mockit.Deencapsulation;
import mockit.Injectable;
import mockit.NonStrictExpectations;
import mockit.Verifications;

import org.junit.Before;
import org.junit.Test;

import com.ourownjava.tdd.mockit.AuthenticationManager;
import com.ourownjava.tdd.mockit.Principal;
import com.ourownjava.tdd.mockit.ThridPartyAuthenticationService;


/**
 * 
 * @author Sanju Thomas
 *
 */
public class TestAuthenticationManager {
	
	private AuthenticationManager authenticationManager;
	
	@Injectable
	private ThridPartyAuthenticationService thridPartyAuthenticationService;
	
	@Before
	public void setUp(){
		authenticationManager = new AuthenticationManager();
		Deencapsulation.setField(authenticationManager, "authenticationService", thridPartyAuthenticationService);
	}
	
	@Test
	public void shouldNotAuthenticate() throws AuthenticationException{
		
		new NonStrictExpectations() {{
			thridPartyAuthenticationService.authenticate((Principal) any);
			returns(true);
		}};
		
		final Principal pricipal = new Principal("thegoodguy");
		authenticationManager.authenticate(pricipal);
		
		new Verifications() {{
			Principal vPrincipal;
			thridPartyAuthenticationService.authenticate(vPrincipal = withCapture());
			assertEquals("thegoodguy", vPrincipal.getLoginId());
		}};
	}
	
}
