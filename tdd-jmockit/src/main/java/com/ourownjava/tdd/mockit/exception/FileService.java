package com.ourownjava.tdd.mockit.exception;

import java.io.OutputStream;
import java.rmi.RemoteException;

/**
 * 
 * @author Sanju Thomas
 *
 */
public class FileService {

	private ThirdPartyService thirdPartyService;
	
	public void saveInRemoteRepository(final OutputStream outputStream) throws RemoteSaveFailedException{
		try {
			thirdPartyService.save(outputStream);
		} catch (RemoteException remoteException) {
			throw new RemoteSaveFailedException("Received Remote Exception from ThirdPartyService", remoteException);
		}
	}
	
}
