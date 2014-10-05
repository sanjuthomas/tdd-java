package com.ourownjava.tdd.jmockit;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.rmi.RemoteException;

import mockit.Expectations;
import mockit.Injectable;
import mockit.Tested;

import org.junit.Test;

import com.ourownjava.tdd.mockit.exception.RemoteSaveFailedException;

/**
 * 
 * @author Sanju Thomas
 *
 */
public class TestFileService {

	@Tested
	private FileService fileService;
	
	@Injectable
	private ThirdPartyService thirdPartyService;
	
	@Test(expected = RemoteSaveFailedException.class)
	public void shouldSendFileToThirdParty() throws FileNotFoundException, RemoteSaveFailedException, RemoteException{
		new Expectations() {{
			thirdPartyService.save((OutputStream)any); 
			times = 1;
			result = new RemoteException("to test third party service exception");
		}};
		fileService.save(new File("tdd.test"));
	}
	
}
