package com.ourownjava.tdd.jmockit.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.rmi.RemoteException;

import mockit.Deencapsulation;
import mockit.Injectable;
import mockit.NonStrictExpectations;
import mockit.Verifications;

import org.junit.Before;
import org.junit.Test;

import com.ourownjava.tdd.mockit.exception.FileService;
import com.ourownjava.tdd.mockit.exception.RemoteSaveFailedException;
import com.ourownjava.tdd.mockit.exception.ThirdPartyService;

public class TestFileService {
	
	private FileService fileService;
	
	@Injectable
	private ThirdPartyService thirdPartyService;
	
	@Before
	public void setUp(){
		fileService = new FileService();
		Deencapsulation.setField(fileService, "thirdPartyService", thirdPartyService);
	}
	
	@Test(expected = RemoteSaveFailedException.class)
	public void shouldHandleRemoteException() throws RemoteException, FileNotFoundException, RemoteSaveFailedException{
		
		new NonStrictExpectations() {{
			thirdPartyService.save((OutputStream) any);
			result = new RemoteException();
		}};
		
		fileService.saveInRemoteRepository(new FileOutputStream(new File("test.dat")));
		
		new Verifications() {{
			thirdPartyService.save((OutputStream) any);
		}};
	}

}
