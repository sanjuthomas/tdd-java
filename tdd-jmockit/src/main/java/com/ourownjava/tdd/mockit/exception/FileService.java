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
	
	public void saveInRemoteRepository(final OutputStream outputStream) throws RemoteSaveFailedExpception{
		try {
			thirdPartyService.save(outputStream);
		} catch (RemoteException remoteException) {
			throw new RemoteSaveFailedExpception("Received Remote Exception from ThirdPartyService", remoteException);
		}
	}
	
}
