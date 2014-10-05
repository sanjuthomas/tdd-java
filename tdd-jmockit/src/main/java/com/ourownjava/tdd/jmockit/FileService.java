package com.ourownjava.tdd.jmockit;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.rmi.RemoteException;

import com.ourownjava.tdd.mockit.exception.RemoteSaveFailedException;

/**
 * 
 * @author Sanju Thomas
 *
 */
public class FileService {
	
	private ThirdPartyService thirdPartyService;
	
	public void save(final File file) throws FileNotFoundException, RemoteSaveFailedException {
		try {
			thirdPartyService.save(new FileOutputStream(file));
		} catch (RemoteException e) {
			throw new RemoteSaveFailedException(e.getMessage(), e);
		}
	}
}
